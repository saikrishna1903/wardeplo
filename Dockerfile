FROM java:8
EXPOSE 9012
ADD target/receipe-app-0.0.1-SNAPSHOT.jar receipe-apps5.jar

ENTRYPOINT ["java","-jar","receipe-apps5.jar"]