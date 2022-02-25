# For Java 8, try this
FROM openjdk:8-jdk-alpine

COPY target/account-avro-consumer-0.0.1-SNAPSHOT.jar account-avro-consumer.jar

ENTRYPOINT ["java","-jar","account-avro-consumer.jar"]