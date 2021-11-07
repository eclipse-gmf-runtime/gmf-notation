# Eclipse GMF Runtime - Notation Metamodel

The [Eclipse GMF Runtime](https://projects.eclipse.org/projects/modeling.gmf-runtime) is an industry proven application framework for creating graphical editors using Eclipse EMF and Eclipse GEF.

This repository contains the EMF-based Notation metamodel which is used by GMF Runtime to store its diagrams. The the main GMF Runtime repo at https://github.com/eclipse/gmf-runtime for the actual framework code.

**NOTE:** As of september of 2021, the source code for GMF Notation is now hosted on GitHub at https://github.com/eclipse/gmf-notation. If you have Git clones which refers to the old location at git.eclipse.org, update them or you will not get the latest changes.

### Source

* Clone: https://github.com/eclipse/gmf-notation

### Issues

Issues are tracked in the Eclipse Bugzilla under the _GMF-Runtime_ product:

* [List of all open issues](https://bugs.eclipse.org/bugs/buglist.cgi?classification=Modeling&product=GMF-Runtime&component=Notation&bug_status=UNCONFIRMED&bug_status=NEW&bug_status=ASSIGNED&bug_status=REOPENED)

### Building

From the top-level directory:

    mvn clean verify
    
You can build against a specific Target Platform using `-Dplatform=$PLATFORM_NAME`.
The supported platforms are available in the `org.eclipse.gmf.runtime.target` directory.
For example:

    mvn clean verify -Dplatform=2021-06

### CI

The official builds are executed on the Eclipse-provided Jenkins instance at <https://ci.eclipse.org/gmf-runtime/job/gmf-notation-master/>

### Update Sites

Update Sites (p2 repositories) are available at:
* <https://download.eclipse.org/modeling/gmp/gmf-notation/updates/interim>: nightly builds
* <https://download.eclipse.org/modeling/gmp/gmf-notation/updates/milestones>: milestone builds
* <https://download.eclipse.org/modeling/gmp/gmf-notation/updates/releases>: official releases

### License

[Eclipse Public License 2.0](https://www.eclipse.org/legal/epl-2.0/)
