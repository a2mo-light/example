FROM java:8
COPY ./target/remote-debugging-with-docker-1.0.jar /usr/src/myapp/app.jar
WORKDIR /usr/src/myapp
ENTRYPOINT ["java","-agentlib:jdwp=transport=dt_socket,address=5005,server=y,suspend=n","-Xms2g","-Xmx8g","-jar","app.jar"]
