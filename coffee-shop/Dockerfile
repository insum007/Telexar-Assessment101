FROM openjdk:8
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} coffee-shop.jar
ENTRYPOINT ["java","-jar","/coffee-shop.jar"]
EXPOSE 8081