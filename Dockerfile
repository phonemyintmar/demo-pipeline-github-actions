FROM openjdk:17

WORKDIR /app

COPY target/*.jar /app/demo.jar

CMD ["java", "-jar", "demo.jar"]
