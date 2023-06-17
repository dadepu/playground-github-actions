# Stage 2: Build final image
FROM eclipse-temurin:20-jre-alpine

## Set working directory
WORKDIR /app

# Copy built JAR file from the builder stage
#COPY /app/target/*.jar ./app.jar
COPY /home/runner/work/playground-github-actions/playground-github-actions/*.jar ./app.jar

# Expose application port
EXPOSE 8080

# Start the application
CMD ["java", "-jar", "app.jar"]
