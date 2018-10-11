#!/usr/bin/env bash

mvn clean install

echo "Successfully compile"

docker build -t remote-debug-with-docker  -f ./src/docker/Dockerfile .

echo "Run application on ide remote debug mode"

echo "Enjoy remote debug mode"
