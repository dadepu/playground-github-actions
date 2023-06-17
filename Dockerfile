# Stage 2: Build final image
FROM eclipse-temurin:17-jre-alpine

ARG INPUT_JAR_DIR="."
ARG PORT=8080

## Set working directory
WORKDIR /app

# Copy built JAR file from the builder stage
#COPY /app/target/*.jar ./app.jar
COPY /home/runner/work/playground-github-actions/playground-github-actions/*.jar ./app.jar

# Expose application port
EXPOSE $PORT

# Start the application
CMD ["java", "-jar", "app.jar"]
