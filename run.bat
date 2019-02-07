@ECHO OFF
echo Building the test project
mvn clean dependency:copy-dependencies install
echo Finished Building
echo Running the selenium test
java -jar .\target\LoginTest-1.0-SNAPSHOT.jar
echo UI test completed.
