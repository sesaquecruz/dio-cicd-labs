FROM eclipse-temurin:17-jre-alpine

WORKDIR /opt/app

COPY build/libs/app-1.0.jar /opt/app/app.jar

ENTRYPOINT ["java", "-jar", "/opt/app/app.jar"]