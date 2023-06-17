# Stage 2: Build final image
FROM eclipse-temurin:17-jre-alpine

ARG JAR_INPUT_DIR=.
ARG APP_NAME=app
ARG PORT=8080

## Set working directory
WORKDIR /app

# Copy built JAR file from the builder stage
COPY $JAR_INPUT_DIR/*.jar ./APP_NAME.jar

# Expose application port
EXPOSE $PORT

# Start the application
CMD ["java", "-jar", "$APP_NAME.jar"]
