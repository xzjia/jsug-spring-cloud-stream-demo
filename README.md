# What's this

Toy project for Spring Cloud Stream Demo.


# Cheat sheet

```bash
$ docker-compose exec kafka bash

$ kafka-console-producer --broker-list localhost:9092 --topic input

$ kafka-console-consumer --bootstrap-server localhost:9092 --topic output --from-beginning

```