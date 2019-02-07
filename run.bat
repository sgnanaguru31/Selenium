@ECHO OFF

echo Running Selenium test

mvn clean dependency:copy-dependencies install
dir
java -jar .\target\LoginTest-1.0-SNAPSHOT.jar

echo Done.
