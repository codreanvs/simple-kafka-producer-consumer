FROM openjdk:17

# Add the app jar
ADD build/libs/*.jar kafka-producer-service.jar

ENTRYPOINT java -jar kafka-producer-service.jar \
    --spring.kafka.bootstrap-servers=$BROKER

#docker build -t kafka-producer-service .
