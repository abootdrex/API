# Build stage
FROM maven:latest AS build
WORKDIR /app
COPY . .
RUN mvn clean package -DskipTests

# Final image stage
FROM openjdk:22-slim
WORKDIR /app
COPY --from=build /app/target/thehrm-0.0.1-SNAPSHOT.jar thehrm.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "thehrm.jar"]
