## Kafka Consumer Service

### Build
Gradle command to build
`./gradlew :kafka-consumer-service:build`

### Local run
- Run
  `run com/codreanvs/kafka/KafkaConsumerService.main()`
- Check health check endpoint is UP
  `http://localhost:8081/api/v1/actuator/health`
