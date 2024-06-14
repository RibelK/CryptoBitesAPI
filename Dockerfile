#Build
FROM gradle:latest AS BUILD

WORKDIR /usr/app/
COPY . .

RUN gradle build

# Package
FROM openjdk:latest

ENV JAR_NAME=criptobites-1.0.0.jar
ENV APP_HOME=/usr/app/

WORKDIR $APP_HOME

COPY --from=BUILD $APP_HOME .

EXPOSE 8080
ENTRYPOINT [ "java", "-jar", "criptobites-1.0.0.jar" ]
