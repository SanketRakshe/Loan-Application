# Loan-Application

The Loan Application Service microservice handles loan application requests and performs eligibility checks based on product configurations.

## Getting Started

This service uses Spring Boot, integrates with the Product Service, and is registered with Eureka. It uses OpenFeign for inter-service communication.

### Prerequisites

- Java 17
- Maven
- Docker (optional)

### Local Setup Without Docker

1. **Clone the repository**:
    ```bash
    git clone <repository-url>
    cd loan-application
    ```

2. **Configure application properties**: Update `src/main/resources/application.properties` with service-specific settings:
    ```properties
    spring.application.name=loan-application
    server.port=8100
    ```

3. **Build the application**:
    ```bash
    mvn clean install
    ```

4. **Run the application**:
    ```bash
    mvn spring-boot:run
    ```

### Local Setup With Docker

1. **Build the Docker image**:
    ```bash
    docker build -t loan-application .
    ```

2. **Run the Docker container**:
    ```bash
    docker run -p 8100:8100 loan-application
    ```

Your Loan Application Service should now be available at `http://localhost:8100`.
