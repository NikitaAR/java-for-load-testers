javac -sourcepath .:.. Demo.java
javac -classpath .. Demo.java
java -classpath ..:. Demo

jar -cvf my-super-app.jar .
jar -tf my-super-app.jar
java -cp my-super-app.jar com.jet.edu.Demo
java -jar my-super-app.jar
