# Running the project
You can run the application directly from the IDE or use spring boot maven plugin
`spring-boot:run`

Create a single deployment unit
`mvn clean package`

Running the application JAR
`java -jar springboot-basic-1.0-SNAPSHOT.jar`

Running the application with environment properties
`java -jar springboot-basic-1.0-SNAPSHOT.jar -propertyName=propertyValue`


# Logging
Logging the data into a file in addition to the console:
`logging.path=/var/logs/app.log`
`logging.file=myapp.log`