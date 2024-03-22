FROM openjdk:17-jdk-alpine
MAINTAINER KM
COPY target/Medical-Clinic-Proxy-0.0.1-SNAPSHOT.jar medical-clinic-proxy-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/medical-clinic-proxy-0.0.1-SNAPSHOT.jar"]