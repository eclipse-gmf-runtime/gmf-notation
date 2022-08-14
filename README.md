# Eclipse GMF Runtime - Notation Metamodel

The [Eclipse GMF Runtime](https://projects.eclipse.org/projects/modeling.gmf-runtime) is an industry proven application framework for creating graphical editors using Eclipse EMF and Eclipse GEF.

This repository contains the EMF-based Notation metamodel which is used by GMF Runtime to store its diagrams. The the main GMF Runtime repo at https://github.com/eclipse/gmf-runtime for the actual framework code.

**NOTE:** As of september of 2021, the source code for GMF Notation is now hosted on GitHub at https://github.com/eclipse/gmf-notation. If you have Git clones which refers to the old location at git.eclipse.org, update them or you will not get the latest changes.

### Source

* Clone: https://github.com/eclipse/gmf-notation

### Requirements

* Java 8 (will probably move to Java 11 soon to be more consistent with GMF Runtime).
* Eclipse 2020-09 (Eclipse Platform 4.17, EMF 2.23) or later.

The general rule is to stay compatible with the current Java LTS version and the previous one, and about 2 years old Eclipse versions, as long as it does not create too much maintenance burden.

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

The official builds are executed on the Eclipse-provided Jenkins instance at <https://ci.eclipse.org/gmf-runtime/> (shared with [GMF Runtime](https://github.com/eclipse/gmf-runtime)).
The two jobs which convern GMF Notation are:
* <https://ci.eclipse.org/gmf-runtime/job/gmf-notation-all/>: build and run the tests against all supported target platforms, including a "canary" one which depends on the latest nightlies of all dependencies. The results are not published, the job is only there to check compatibility with different versions of Eclipse.
* <https://ci.eclipse.org/gmf-runtime/job/gmf-notation/>: build and run the tests against the "reference" target platform (typically the oldest of the supported ones) and publishes the result (as an **I**nterim, **M**ilestone or **R**elease depending on how the job was launched.

### Update Sites

Update Sites (p2 repositories) are available at:
* <https://download.eclipse.org/modeling/gmp/gmf-notation/updates/interim>: nightly builds
* <https://download.eclipse.org/modeling/gmp/gmf-notation/updates/milestones>: milestone builds
* <https://download.eclipse.org/modeling/gmp/gmf-notation/updates/releases>: official releases

| Version | Repository URL                                                                        |
|:--------|:--------------------------------------------------------------------------------------|
| 1.7.0   | https://download.eclipse.org/modeling/gmp/gmf-notation/updates/releases/R201306101425 |
| 1.8.0   | https://download.eclipse.org/modeling/gmp/gmf-notation/updates/releases/R201306101425 |
| 1.8.0   | https://download.eclipse.org/modeling/gmp/gmf-notation/updates/releases/R201306101425 |
| 1.8.0   | https://download.eclipse.org/modeling/gmp/gmf-notation/updates/releases/R201306101425 |
| 1.8.0   | https://download.eclipse.org/modeling/gmp/gmf-notation/updates/releases/R201306101425 |
| 1.8.0   | https://download.eclipse.org/modeling/gmp/gmf-notation/updates/releases/R201306101425 |
| 1.8.0   | https://download.eclipse.org/modeling/gmp/gmf-notation/updates/releases/R201405281433 |
| 1.9.0   | https://download.eclipse.org/modeling/gmp/gmf-notation/updates/releases/R201505312221 |
| 1.10.0  | https://download.eclipse.org/modeling/gmp/gmf-notation/updates/releases/R201606071631 |
| 1.11.0  | https://download.eclipse.org/modeling/gmp/gmf-notation/updates/releases/R201706061354 |
| 1.12.0  | https://download.eclipse.org/modeling/gmp/gmf-notation/updates/releases/R201805221301 |
| 1.13.0  | https://download.eclipse.org/modeling/gmp/gmf-notation/updates/releases/R202004160913 |

### License

[Eclipse Public License 2.0](https://www.eclipse.org/legal/epl-2.0/)
