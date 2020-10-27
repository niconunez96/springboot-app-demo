FROM openjdk:11

WORKDIR /apirest-demo/

COPY ./target/*.jar .

CMD ["java", "-jar", "./demodeploy-1.1.0-SNAPSHOT.jar"]