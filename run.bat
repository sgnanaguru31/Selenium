@ECHO OFF
echo Building the test project
call mvn clean dependency:copy-dependencies install
echo Finished Building
echo Running the selenium test
java -jar .\target\LoginTest-1.0-SNAPSHOT.jar
echo UI test completed.
echo removing website
FOR /f "tokens=*" %%i IN ('docker ps -aq') DO docker stop %%i && docker rm %%i
FOR /f "tokens=*" %%i IN ('docker images --format "{{.ID}}"') DO docker rmi %%i
echo website removed

