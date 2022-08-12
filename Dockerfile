FROM openjdk:11
EXPOSE 8080
ADD target/SpringRest-0.0.1-SNAPSHOT.jar SpringRest-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/SpringRest-0.0.1-SNAPSHOT.jar"]
