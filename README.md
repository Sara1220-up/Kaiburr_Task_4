# 🧩 Task 4 — CI/CD Pipeline for Spring Boot Application using GitHub Actions & Docker Hub

This project implements a **Continuous Integration and Continuous Deployment (CI/CD)** pipeline that automatically builds a **Spring Boot application**, creates a **Docker image**, and pushes it to **Docker Hub** using **GitHub Actions**.

---

## ⚙️ Pipeline Overview

The GitHub Actions workflow performs the following automated steps whenever code is pushed to the `main` branch 👇  

1. 🧾 Checkout the source code from GitHub  
2. ☕ Set up **JDK 17** and build the Spring Boot application using Maven  
3. 🐳 Build a Docker image from the Dockerfile present in the repository  
4. 🔐 Authenticate to **Docker Hub** using GitHub Secrets  
5. 🚀 Push the Docker image to Docker Hub automatically  
6. 🎉 Display a final summary in the workflow log  

---

## 🧰 Technologies Used

| Component | Purpose |
|------------|----------|
| **Spring Boot 3 / Java 17** | Application framework |
| **Maven** | Build and package tool |
| **Docker** | Containerization |
| **GitHub Actions** | CI/CD automation |
| **Docker Hub** | Image registry |

---

## 🧠 Secrets Configuration

Two repository secrets were created in **GitHub → Settings → Secrets → Actions** to securely authenticate with Docker Hub:

| Secret Name | Description |
|--------------|--------------|
| `DOCKER_HUB_USERNAME` | Docker Hub username → `sarayu2020` |
| `DOCKER_HUB_ACCESS_TOKEN` | Docker Hub access token (Read/Write/Delete scope) |

✅ Secrets Created Screenshot 👇  
![Secrets Created](https://github.com/Sara1220-up/Kaiburr-Task-1/raw/main/Task%204/Secrete%20codes_Created.png)

---

## 🧩 Workflow Configuration

The workflow file `.github/workflows/build-and-push.yml` automates the build and push process using Docker Buildx and Maven.  
Below is the proof of the workflow created and executed successfully 👇  

### ⚙️ Workflow File in Repository
![Full Workflow](https://github.com/Sara1220-up/Kaiburr-Task-1/raw/main/Task%204/full_workflow.png)

### 🧱 Workflow Compiled Successfully
![Workflow Compiled](https://github.com/Sara1220-up/Kaiburr-Task-1/raw/main/Task%204/workflow_compiled.png)

---

## 🐳 Docker Image Build & Push

After the workflow runs successfully, the Spring Boot application is containerized and pushed to Docker Hub automatically.

✅ Image Created on Docker Hub 👇  
![Image Created](https://github.com/Sara1220-up/Kaiburr-Task-1/raw/main/Task%204/image_created.png)

---

## 🌍 Docker Hub Repository Verification

The image is available publicly on Docker Hub under your account:

**Docker Hub Repository:**  
🔗 [https://hub.docker.com/repository/docker/sarayu2020/kaiburr-task4](https://hub.docker.com/repository/docker/sarayu2020/kaiburr-task4)

✅ Full Repository View in Docker 👇  
![Full Docker View](https://github.com/Sara1220-up/Kaiburr-Task-1/raw/main/Task%204/Full_view_in_Docker.png)

---

## 🏁 Results / Outcome

✅ Successful end-to-end CI/CD workflow using GitHub Actions  
✅ Automated Docker image build and push to Docker Hub  
✅ Reusable pipeline for future Spring Boot projects  

---

## 🧩 Author

**👤 Sarayu Mandadi**  
📦 Kaiburr Internship – Task 4 Submission  
📧 Docker Hub: [`sarayu2020`](https://hub.docker.com/u/sarayu2020)
