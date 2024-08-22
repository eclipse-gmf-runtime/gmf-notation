#!/bin/sh
# Copyright (c) 2012, 2019 IBM Corporation and others.
# This program and the accompanying materials are made
# available under the terms of the Eclipse Public License 2.0
# which is available at https://www.eclipse.org/legal/epl-2.0/
#
# SPDX-License-Identifier: EPL-2.0
#
# Contributors:
#   IBM - Initial API and implementation

# Script needs 4-5 environment parameters:
# Hudson job name: ${JOB_NAME}
# Hudson build id: ${BUILD_ID}
# Hudson workspace: ${WORKSPACE}
# ${BUILD_TYPE}: n(ightly), m(aintenance), s(table), r(elease)
# ${BUILD_LABEL}: An optional label to append to the version string when creating drop files, e.g. M5 or RC1
# 
set -e

if [ -z "$JOB_NAME" ]; then
	echo "Error there is no Hudson JOB_NAME defined"; 
	exit 0
fi

if [ -z "$BUILD_ID" ]; then
	echo "Error there is no Hudson BUILD_ID defined"; 
	exit 0
fi

if [ -z "$WORKSPACE" ]; then
	echo "Error there is no Hudson WORKSPACE defined"; 
	exit 0
fi

if [ -z "$BUILD_TYPE" ]; then
	echo "Error there is no BUILD_TYPE defined"; 
	exit 0
else
	buildType=$BUILD_TYPE
fi

if [ -z "$BUILD_LABEL" ]; then
	echo "Error there is no BUILD_LABEL defined"; 
	exit 0
else
	if [ "$BUILD_LABEL" != "NONE" ]; then
		dropFilesLabel=$BUILD_LABEL
	fi
fi

# Determine the local update site we want to publish from
localTarget=${WORKSPACE}/org.eclipse.gmf.notation.repository/target
localUpdateSite=${localTarget}/repository/
echo "`date +%Y-%m-%d-%H:%M:%S` Using local update-site: $localUpdateSite"

# Determine remote update site we want to promote to (integration and maintenance are published on interim site, stable builds on milestone site, release builds on releases site)
case $buildType in
	m|M) remoteSite=maintenance ;;
	i|I) remoteSite=interim ;;
	s|S) remoteSite=milestones ;;
	r|R) remoteSite=releases ;;
	*) exit 0 ;;
esac
echo "`date +%Y-%m-%d-%H:%M:%S` Publishing as $remoteSite ( $buildType ) build"
remoteUpdateSiteBase="modeling/gmp/gmf-notation/updates/$remoteSite"
remoteUpdateSite="/home/data/httpd/download.eclipse.org/$remoteUpdateSiteBase"
echo "`date +%Y-%m-%d-%H:%M:%S` Publishing to remote update-site: $remoteUpdateSite"

if [ -z "$dropFilesLabel" -a "$buildType" != i  -a "$buildType" != I -a "$buildType" != r  -a "$buildType" != R]; then
	echo "Please provide a drop files label to append to the version (e.g. M5, RC1) if this is not an I or R build."
	exit 0
fi

# Prepare a temp directory
tmpDir="$localTarget/$JOB_NAME-publish-tmp"
rm -fr $tmpDir
mkdir -p $tmpDir
cd $tmpDir
echo "`date +%Y-%m-%d-%H:%M:%S` Working in `pwd`"

# Download and prepare Eclipse SDK, which is needed to process the update site
echo "`date +%Y-%m-%d-%H:%M:%S` Downloading eclipse to $PWD"
cp /home/data/httpd/archive.eclipse.org/eclipse/downloads/drops4/R-4.12-201906051800/eclipse-SDK-4.12-linux-gtk-x86_64.tar.gz .
tar -xzf eclipse-SDK-4.12-linux-gtk-x86_64.tar.gz
cd eclipse
chmod 700 eclipse
cd ..
if [ ! -d "eclipse" ]; then
	echo "Failed to download an Eclipse SDK, being needed for provisioning."
	exit
fi
# Prepare Eclipse SDK to provide WTP releng tools (used to postprocess repository, i.e set p2.mirrorsURL property)
echo "`date +%Y-%m-%d-%H:%M:%S` Installing WTP Releng tools"
./eclipse/eclipse -nosplash --launcher.suppressErrors -clean -debug -application org.eclipse.equinox.p2.director -repository https://download.eclipse.org/webtools/releng/repository/ -installIUs org.eclipse.wtp.releng.tools.feature.feature.group
# Clean up
rm eclipse-SDK-4.12-linux-gtk-x86_64.tar.gz

# Generate drop files
echo "`date +%Y-%m-%d-%H:%M:%S` Converting update site to runnable form"
./eclipse/eclipse -nosplash -consoleLog -application org.eclipse.equinox.p2.repository.repo2runnable -source file:$localUpdateSite -destination file:drops/eclipse
qualifiedVersion=$(find $localUpdateSite/features/ -maxdepth 1 | grep "gmf.runtime.notation_" | sed 's/.jar$//')
echo "`date +%Y-%m-%d-%H:%M:%S` qualifiedVersion is $qualifiedVersion"
qualifiedVersion=${qualifiedVersion#*_}
echo "`date +%Y-%m-%d-%H:%M:%S` qualifiedVersion is $qualifiedVersion"
qualifier=${qualifiedVersion##*.}
echo "`date +%Y-%m-%d-%H:%M:%S` qualifier is $qualifier"
qualifier=${qualifier#v}
echo "`date +%Y-%m-%d-%H:%M:%S` qualifier is $qualifier"
version=${qualifiedVersion%.*}
echo "`date +%Y-%m-%d-%H:%M:%S` version is $version"
dropDir="$(echo $buildType | tr '[:lower:]' '[:upper:]')$qualifier"
echo "`date +%Y-%m-%d-%H:%M:%S` dropDir is $dropDir"
localDropDir=drops/$version/$dropDir
echo "`date +%Y-%m-%d-%H:%M:%S` Creating drop files in local directory $tmpDir/$localDropDir"
mkdir -p $localDropDir

# Prepare local update site (merging is performed later, if required)
stagedUpdateSite="updates/$remoteSite/$dropDir"
mkdir -p $stagedUpdateSite
cp -R $localUpdateSite/* $stagedUpdateSite
echo "`date +%Y-%m-%d-%H:%M:%S` Copied $localUpdateSite to local directory $stagedUpdateSite."

# Append drop file suffix if one is specified				
if [ -n "$dropFilesLabel" ]; then
	version=$version$dropFilesLabel
	echo "`date +%Y-%m-%d-%H:%M:%S` version is now $version"
elif [ "$buildType" != r -a "$buildType" != R ]; then
	version="$(echo $buildType | tr '[:lower:]' '[:upper:]')$qualifier"
	echo "`date +%Y-%m-%d-%H:%M:%S` version is now $version"
else
	echo "`date +%Y-%m-%d-%H:%M:%S` version is now $version"
fi
				
cd drops

# gmf-notation SDK
zip -r ../$localDropDir/gmf-sdk-notation-$version.zip \
	eclipse/features/org.eclipse.gmf.runtime.notation.sdk_* \
	eclipse/features/org.eclipse.gmf.runtime.notation.source_* \
	eclipse/features/org.eclipse.gmf.runtime.notation_* \
	eclipse/plugins/org.eclipse.gmf.runtime.notation_* \
	eclipse/plugins/org.eclipse.gmf.runtime.notation.edit_* \
	eclipse/plugins/org.eclipse.gmf.runtime.notation.sdk_* \
	eclipse/plugins/org.eclipse.gmf.runtime.notation.source_* \
	eclipse/plugins/org.eclipse.gmf.runtime.notation.edit.source_* \
	eclipse/plugins/org.eclipse.gmf.runtime.notation.sdk.source_*
md5sum ../$localDropDir/gmf-sdk-notation-$version.zip > ../$localDropDir/gmf-sdk-notation-$version.zip.md5
echo "`date +%Y-%m-%d-%H:%M:%S` Created gmf-sdk-notation-$version.zip"
				
# gmf-notation runtime
zip -r ../$localDropDir/gmf-notation-$version.zip \
	eclipse/features/org.eclipse.gmf.runtime.notation_* \
	eclipse/plugins/org.eclipse.gmf.runtime.notation_* \
	eclipse/plugins/org.eclipse.gmf.runtime.notation.edit_*
md5sum ../$localDropDir/gmf-notation-$version.zip > ../$localDropDir/gmf-notation-$version.zip.md5
echo "`date +%Y-%m-%d-%H:%M:%S` Created gmf-notation-$version.zip"
				
# gmf-notation automated-tests
zip -r ../$localDropDir/gmf-tests-notation-$version.zip \
	eclipse/plugins/org.eclipse.gmf.tests.runtime.notation_* \
	eclipse/features/org.eclipse.gmf.tests.runtime.notation_*
md5sum ../$localDropDir/gmf-tests-notation-$version.zip > ../$localDropDir/gmf-tests-notation-$version.zip.md5
echo "`date +%Y-%m-%d-%H:%M:%S` Created gmf-tests-notation-$version.zip"
	
cd $tmpDir
		
cd $stagedUpdateSite
zip -r ../../../$localDropDir/gmf-notation-Update-$version.zip features plugins binary artifacts.jar content.jar
md5sum ../../../$localDropDir/gmf-notation-Update-$version.zip > ../../../$localDropDir/gmf-notation-Update-$version.zip.md5
echo "`date +%Y-%m-%d-%H:%M:%S` Created gmf-notation-Update-Site-$version.zip"

cd $tmpDir

#generating build.cfg file to be referenced from downloads web page
echo "hudson.job.name=${JOB_NAME}" > $localDropDir/build.cfg
echo "hudson.job.id=${BUILD_NUMBER} (${jobDir##*/})" >> $localDropDir/build.cfg
echo "hudson.job.url=${BUILD_URL}" >> $localDropDir/build.cfg

remoteDropDir=/home/data/httpd/download.eclipse.org/modeling/gmp/gmf-notation/downloads/$localDropDir
mkdir -p $remoteDropDir
cp -R $localDropDir/* $remoteDropDir/
echo "`date +%Y-%m-%d-%H:%M:%S` Published drop files in local directory $tmpDir/$localDropDir to $remoteDropDir"

# Ensure p2.mirrorURLs property is used in update site
echo "`date +%Y-%m-%d-%H:%M:%S` Setting p2.mirrorsURL to http://www.eclipse.org/downloads/download.php?format=xml&file=/$remoteUpdateSiteBase"
./eclipse/eclipse -nosplash --launcher.suppressErrors -clean -debug -application org.eclipse.wtp.releng.tools.addRepoProperties -vmargs -DartifactRepoDirectory=$PWD/$stagedUpdateSite -Dp2MirrorsURL="http://www.eclipse.org/downloads/download.php?format=xml&file=/$remoteUpdateSiteBase"

# Create p2.index file
if [ ! -e "$stagedUpdateSite/p2.index" ]; then
	echo "`date +%Y-%m-%d-%H:%M:%S` Creating p2.index file"
	echo "version = 1" > $stagedUpdateSite/p2.index
	echo "metadata.repository.factory.order = content.xml,\!" >> $stagedUpdateSite/p2.index
	echo "artifact.repository.factory.order = artifacts.xml,\!" >> $stagedUpdateSite/p2.index
fi

# Create the composite update site
echo "`date +%Y-%m-%d-%H:%M:%S` Create the composite update site repository file and add ${dropDir}."
cat > p2.composite.repository.xml <<EOF
<?xml version="1.0" encoding="UTF-8"?>
<project name="p2 composite repository">
<target name="default">
<p2.composite.repository>
<repository compressed="true" location="${remoteUpdateSite}" name="${JOB_NAME}" append="false"/>
<add>
<repository location="${dropDir}"/>
</add>
</p2.composite.repository>
</target>
</project>
EOF

# Backup then clean remote update site
if [ -d "$remoteUpdateSite" ]; then
	echo "`date +%Y-%m-%d-%H:%M:%S` Add existing update sites to the composite update site repository file."
	for existingDropDir in `find ${remoteUpdateSite}/ -mindepth 1 -maxdepth 1 -type d | sort | tail -n 4` ; do
		addExistingDropDir=$(basename $existingDropDir)
		echo "`date +%Y-%m-%d-%H:%M:%S` Add ${addExistingDropDir}."
		addRepositoryLocation="<repository location=\"${addExistingDropDir}\"/>"
		sed -i "/<add>/a\
${addRepositoryLocation}" p2.composite.repository.xml
	done
fi

echo "`date +%Y-%m-%d-%H:%M:%S` Publishing local $stagedUpdateSite directory to remote update site $remoteUpdateSite/$dropDir"
mkdir -p $remoteUpdateSite
cp -R $stagedUpdateSite $remoteUpdateSite

echo "`date +%Y-%m-%d-%H:%M:%S` Refresh the composite update site"
rm ${remoteUpdateSite}/compositeArtifacts.jar ${remoteUpdateSite}/compositeContent.jar
./eclipse/eclipse -nosplash --launcher.suppressErrors -clean -debug -application org.eclipse.ant.core.antRunner -buildfile p2.composite.repository.xml default

# Clean up
echo "`date +%Y-%m-%d-%H:%M:%S` Cleaning up"
#rm -fr eclipse
#rm -fr update-site
