FROM openjdk:11-jdk-slim

WORKDIR /app

COPY bin /app/bin
COPY lib /app/lib
COPY src /app/src

RUN javac -d bin -cp lib/* src/*.java

CMD ["java", "-cp", "bin:lib/*", "App"]