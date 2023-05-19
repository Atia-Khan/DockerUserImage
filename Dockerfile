# Use an appropriate base image for your Spring Boot application
FROM openjdk:17 


# Set the working directory in the container
WORKDIR /app

# Copy the compiled JAR file into the container
COPY target/javapractice-0.0.1-SNAPSHOT.jar app.jar


ENV SPRING_DATASOURCE_URL=jdbc:postgresql://localhost:5432/userpracticedb
ENV SPRING_DATASOURCE_USERNAME=atia
ENV SPRING_DATASOURCE_PASSWORD=123

EXPOSE 8080

# Specify the command to run your Spring Boot application
CMD ["java", "-jar", "app.jar"]
