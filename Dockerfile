FROM openjdk:11

WORKDIR /apirest-demo/

## Add the wait script to the image
ADD https://github.com/ufoscout/docker-compose-wait/releases/download/2.7.3/wait /wait
RUN chmod +x /wait

COPY ./target/*.jar app.jar

ENV PORT 8080
CMD ["java", "-jar", "-Dserver.port=${PORT}", "./app.jar"]