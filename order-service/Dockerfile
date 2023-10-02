# Use the official OpenJDK base image
FROM openjdk:8-jdk-alpine

# Set the working directory
WORKDIR /app

# Copy the compiled JAR file into the container
COPY target/order-service-0.0.1-SNAPSHOT.jar /app

EXPOSE 8089

# Specify the command to run your application
ENTRYPOINT ["java", "-jar", "order-service-0.0.1-SNAPSHOT.jar"]