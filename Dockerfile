FROM openjdk:11-jdk
COPY src /twwo4/app/src
COPY pom.xml /twwo4/app
WORKDIR /twwo4/app
RUN apt-get update \
  && apt-get -y install maven mariadb-client \
  && mvn clean install -DskipTests 
CMD mvn spring-boot:run