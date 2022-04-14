FROM adoptopenjdk/openjdk11:alpine
ARG JAR_FILE='./praktikum/springboot-helloworld-main/target/*.jar'

COPY ${JAR_FILE} /app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]