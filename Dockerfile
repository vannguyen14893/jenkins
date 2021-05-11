FROM openjdk:8-jdk-alpine
VOLUME /tmp
ADD /target/docker_test.jar docker_test.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/docker_test.jar"]
