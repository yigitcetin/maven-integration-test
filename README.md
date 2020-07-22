# Java Integration Test

An integration test using maven dependency management with failsafe plugin

## Running the tests

To see the test result, you have run one of these commands in project directory

```
mvn verify
```  
or

```
mvn integration-test
```      

## Reports

To get the html report, you have to run this command in project directory
```
 mvn verify && mvn site
```
After that you can find the html file under
``` 
open target/site/failsafe-report.html
``` 

## Built With

* [Junit](https://junit.org/junit5/) - Testing framework used
* [Maven](https://maven.apache.org/) - Dependency Management
* [Swagger](https://generator.swagger.io/) - Used to generate Api response

