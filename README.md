# Java Integration Test

An integration test using maven dependency management with failsafe plugin

## Running the tests

To see the test result, you have run these commands at below

```
mvn verify
```  
or

```
mvn integration-test
```      

## Reports

### XML Reports
You can find the report after test finished under target directory
``` 
cd target/failsafe-reports 
```  

### Html Report
To get the html report, you have to run this command
```
 mvn verify && mvn site
```
After that you can find the 

## Built With

* [Junit](https://junit.org/junit5/) - Testing framework used
* [Maven](https://maven.apache.org/) - Dependency Management
* [Swagger](https://generator.swagger.io/) - Used to generate Api response

