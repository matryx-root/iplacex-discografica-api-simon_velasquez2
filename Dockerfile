
FROM gradle:8.2-jdk17 as builder
WORKDIR /app
COPY . .
RUN gradle build --no-daemon


FROM openjdk:17-jdk-slim
WORKDIR /app
COPY --from=builder /app/build/libs/*.jar app.jar
ENTRYPOINT ["java", "-jar", "app.jar"]
