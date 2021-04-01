MindTree Tech Test

Codes and Test Prepared by:

*Rajeev Dahal

Software QA Engineer

rajeev.dahal17@gmail.com

https://www.linkedin.com/in/rajeevdahal/

- Build Tool: Maven

- Test Framework: Cucumber BBD (with JUnit Assertions)

Environments:

https://www.selenium.dev/

https://www.selenium.dev/project/

https://www.selenium.dev/downloads/

https://www.selenium.dev/documentation/en/grid/

https://www.selenium.dev/documentation/en/grid/grid_3/
System Requirements:

Java 8 + JDK

IntelliJ Cucumber Plugin

IntelliJ Gherkin Plugin

Test RUN

Note: To run the scenarios, use @wip tag for all feature test 

in the CukesRunner class/Cucumber Options.

1. Way:
Clone the projects

Import maven dependencies from POM

Go src -> test > java > Runners > CukesRunner and Run

To generate "HTML Maven Cucumber Report" ;

Open Maven right side panel Double Click Project's Lifecycle Click "verify"

2. Way:

Run from command line invoke mvn clean verify

Test Reports Locations

1- Cucumber HTML Plugin Reports target -> cucumber-html-reports > overview-features.html (Right Click and Open in any Browser )

2- When you run my project, Cucumber will create automatically online report link. You can click the link with in the 24 hours and check the all test steps and status.


2021 MARCH; 

https://github.com/rajeev7353/SeleniumModuleTest

End