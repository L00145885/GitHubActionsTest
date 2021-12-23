FROM openjdk:8-jdk-alpine
ARG JAR_FILE=github-actions-artifact/*.jar
COPY ${JAR_FILE} mvnUnitTesting-0.0.1-SNAPSHOT.jar
ENTRYPOINT [“java”,"-jar","/mvnUnitTesting-0.0.1-SNAPSHOT.jar"]
