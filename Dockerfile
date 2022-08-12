FROM openjdk:11
EXPOSE 8080
ADD target/springboot-backend-0.0.1-SNAPSHOT.jar springboot-backend-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/springboot-backend-0.0.1-SNAPSHOT.jar"]
