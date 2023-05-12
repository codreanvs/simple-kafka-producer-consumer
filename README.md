## Simple Kafka Producer-Consumer Service

### Setup Kafka
- Run
  `docker-compose -f docker-compose-kafka.yml up -d`

### Build service artifacts
Gradle command to build
`./gradlew clean build`

### Build services as Docker images
- Run

  `docker build -t kafka-producer-service .`

  `docker build -t kafka-consumer-service .`

### Local run
- Run Kafka Producer Service
  `run com/codreanvs/kafka/KafkaProducerService.main()`
- Check health check endpoint is UP
  `http://localhost:8080/api/v1/actuator/health`

- Run Kafka Consumer Service
  `run com/codreanvs/kafka/KafkaConsumerService.main()`
- Check health check endpoint is UP
  `http://localhost:8081/api/v1/actuator/health`

### Docker run
- Run
  `docker-compose -f docker-compose-producer-consumer.yml up -d`
