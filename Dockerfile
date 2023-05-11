FROM amazoncorretto:11-alpine-jdk
COPY target/portfolio-0.0.1-SNAPSHOT.jar cfb-app.jar
ENTRYPOINT ["java", "-jar", "/cfb-app.jar"]
