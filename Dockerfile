FROM eclipse-temurin:17-jdk-alpine
VOLUME /tmp
COPY target/portfolio-0.0.1-SNAPSHOT.jar cfb-app.jar
ENTRYPOINT ["java", "-jar", "/cfb-app.jar"]
EXPOSE 8080