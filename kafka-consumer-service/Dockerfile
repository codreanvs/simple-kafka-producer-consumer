FROM openjdk:17

# Add the app jar
ADD build/libs/*.jar kafka-consumer-service.jar

ENTRYPOINT java -jar kafka-consumer-service.jar \
    --spring.kafka.bootstrap-servers=$BROKER

#docker build -t kafka-consumer-service .
