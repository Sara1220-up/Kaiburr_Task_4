# Task 1 — Spring Boot REST API with MongoDB

This is the implementation of **Task 1** from the **Kaiburr Internship**, which involves creating a simple **Spring Boot application** connected to **MongoDB** to manage tasks.

---

## 📖 Task Description

Create a **REST API** using **Spring Boot** that performs the following operations:

1. Create or update a task.
2. Retrieve all tasks from the database.
3. Connect the Spring Boot application to **MongoDB** for storage.

The project must expose REST endpoints and verify successful integration using both **API requests** and **MongoDB database output**.

---

## 🧩 Project Structure

taskmanager/
│
├── pom.xml
├── src/
│ ├── main/
│ │ ├── java/
│ │ │ └── com/kaiburr/taskmanager/
│ │ │ ├── controller/TaskController.java
│ │ │ ├── model/Task.java
│ │ │ ├── repository/TaskRepository.java
│ │ │ └── service/TaskService.java
│ │ └── resources/
│ │ └── application.properties
│ └── test/
│ └── java/
│ └── com/kaiburr/taskmanager/
└── README.md


---

## ⚙️ Prerequisites

Before running the project, ensure you have:
- **Java 17+** or higher  
- **Apache Maven 3.8+**  
- **MongoDB (running locally on port 27017)**  

---

## 🧠 MongoDB Setup

1. Install and start MongoDB:
   ```bash
   net start MongoDB
mongosh
show dbs
use kaiburrdb
