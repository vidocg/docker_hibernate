FROM openjdk:8-jdk-alpine
ARG JAR_FILE=target/*.jar
#need to use docker.host.internal as localhost is not available inside container
ENV SPRING_DATASOURCE_URL="jdbc:postgresql://host.docker.internal:5432/postgres" \
    SPRING_DATASOURCE_USERNAME="postgres" \
    SPRING_DATASOURCE_PASSWORD="admin" \
    DB_SCHEMA="docker_hibernate_db"
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/app.jar"]
#specify port to expose from container
EXPOSE 3131