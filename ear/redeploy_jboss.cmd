cd ..
call mvn clean install -Dmaven.test.skip
cd ear
call mvn jboss-as:deploy
pause