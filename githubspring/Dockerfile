FROM openjdk:8-jdk-alpine


# cd /opt/app
WORKDIR /opt/app
COPY target/try1-0.0.1-SNAPSHOT.jar try1-0.0.1-SNAPSHOT.jar

# java -jar /opt/app/app.jar
ENTRYPOINT ["java","-jar","try1-0.0.1-SNAPSHOT.jar"]