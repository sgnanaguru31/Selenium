@ECHO OFF
echo Building the test project
call mvn clean dependency:copy-dependencies install
echo Finished Building
echo Running the selenium test
call java -jar .\target\LoginTest-1.0-SNAPSHOT.jar
echo UI test completed.
docker rm -f $(docker ps -a -q)
echo website removed