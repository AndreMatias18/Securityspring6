
# Flowdesk v1

![Status](https://img.shields.io/badge/Status-In%20Development-yellow)
![License: MIT](https://img.shields.io/badge/License-MIT-blue)

## 📌 Overview

**Flowdesk** is a web application designed to improve communication between technical teams (developers) and employees in small and medium-sized companies.  
The system combines **ticket management**, **integrated chat**, **remote assistance**, and an **administrative backoffice**, all powered by a secure and well-structured Java back-end.

Its main goal is to provide faster, clearer and more organised technical support, reducing communication issues and centralising all information in one platform.

---

## 🔧 Main Features

- **JWT Authentication**  
  Secure login using JSON Web Tokens with role-based access control.

- **Ticket Management System**  
  Create, edit, assign, prioritise, change status and track full ticket history.

- **Integrated Ticket Chat**  
  Each ticket has its own dedicated chat for focused communication between user and technician.

- **Remote Assistance**  
  Technicians may remotely access the user's machine (with explicit permission) for complex issues.

- **Backoffice / Administration**  
  Manage users, departments, permissions and company settings.

- **Dashboard & Analytics**  
  Visual metrics showing support performance and activity.

---

## 🧱 Tech Stack

### **Back-end**
- Java  
- JWT  
- JPA / JDBC  
- Maven / Gradle

### **Front-end**
- HTML5  
- CSS3  
- Bootstrap 4 
- JavaScript

### **Database**
- MySQL

### **Deployment**
- VPS hosting  
- Docker  
- Docker Compose  

---

## 🏛️ Application Architecture

Layered structure:

- **Controllers** → Handle HTTP requests  
- **Services** → Business logic  
- **Repositories / DAOs** → Database access (MySQL)  
- **Entities** → Data models  
- **Security** → JWT authentication & access control  

---


