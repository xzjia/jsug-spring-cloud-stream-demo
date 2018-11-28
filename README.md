# What's this

Toy project for Spring Cloud Stream Demo.

# Setup
Use one of the following ways to setup ZooKeeper and Kafka, which is necessary to run the application(s):
- docker-compose
- Homebrew
- Binary

NOTE: The application(s) assume Kafka is running on `localhost:9092`.

```bash
# With docker-compose
$ docker-compose up -d

# To clean up
$ docker-compose down
```

# Point

1. Basic functionality: send message (two different ways), receive message, function composition
1. Content-type negotiation
1. Honor other frameworks: @StreamListener @ServiceActivator @KafkaListener
1. Actuator endpoint of bindings, pause

# Cheat sheet

```bash
$ docker-compose exec kafka bash

$ kafka-topics --list --zookeeper zookeeper:2181

$ kafka-console-consumer --bootstrap-server localhost:9092 --from-beginning --topic upstream

$ kafka-console-consumer --bootstrap-server localhost:9092 --from-beginning --topic downstream

```