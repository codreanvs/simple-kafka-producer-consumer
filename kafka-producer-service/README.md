## Kafka Producer Service

### Build
Gradle command to build
`./gradlew :kafka-producer-service:build`

### Local run
- Run
  `run com/codreanvs/kafka/KafkaProducerService.main()`
- Check health check endpoint is UP
  `http://localhost:8080/api/v1/actuator/health`
