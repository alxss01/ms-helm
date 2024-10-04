FROM openjdk:17-alpine

WORKDIR /app

COPY target/ms-helm.jar app.jar

EXPOSE 7070

ENTRYPOINT [ "java", "-jar", "app.jar" ]