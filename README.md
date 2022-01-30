# Saga-coreography-pattern

## Description

Project created using the video [Microservices Architecture Patterns | SAGA Choreography Explained & Project Creation | JavaTechie
](https://www.youtube.com/watch?v=aOen1-pQLZg&list=PLVz2XdJiJQxw1H3JVhclHc__WYDaiS1uL)


## Set up

After install Kafka, go to the bin folder (windows if you work with windows) and run in two terminals the following 
commands:

zookeeper-server-start.bat YOUR_KAFKA_FOLDER\config\zookeeper.properties

kafka-server-start.bat YOUR_KAFKA_FOLDER\config\server.properties

Launch docker compose with the database.

Launch oder-service and payment-service

## Use

Use saga-coreography-pattern.postman_collection.json to test the application.