FROM openjdk:latest
COPY ./target/seMethods-0.1.0.3-jar-with-dependencies.jar /tmp
WORKDIR /tmp
ENTRYPOINT ["java", "-jar", "seMethods-v0.1.0.4-jar-with-dependencies.jar"]