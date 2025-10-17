FROM openjdk:17-jdk-slim
WORKDIR /app
COPY target/taskmanager-0.0.1-SNAPSHOT.jar app.jar
ENV MONGO_URI=mongodb://mongo:27017/tasksdb
EXPOSE 8080
ENTRYPOINT ["java","-jar","app.jar"]
