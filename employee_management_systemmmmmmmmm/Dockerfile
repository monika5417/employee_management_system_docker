# Use official OpenJDK 17 image
FROM openjdk:17-jdk

# Set working directory
WORKDIR /app

# Copy Maven wrapper & pom.xml (for caching dependencies)
COPY mvnw pom.xml ./
COPY .mvn .mvn

# Copy source code
COPY src src

# Build the application
RUN chmod +x mvnw && ./mvnw clean package -DskipTests

# Run the application
CMD ["java", "-jar", "target/employee_management_system.war"]

# Expose port
EXPOSE 8080
