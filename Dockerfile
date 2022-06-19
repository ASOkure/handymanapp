FROM openjdk:8-jdk-alpine

ADD target/handymanapp.jar handymanapp.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "/handymanapp.jar"]