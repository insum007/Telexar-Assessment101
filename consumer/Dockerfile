FROM openjdk:8
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} customer.jar
ENTRYPOINT ["java","-jar","/customer.jar"]
EXPOSE 8082