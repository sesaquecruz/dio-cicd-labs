FROM eclipse-temurin:17-jre-alpine

WORKDIR /opt/app

COPY app/build/libs/app.jar /opt/app/

ENTRYPOINT ["java","-jar","/opt/app/app.jar"]