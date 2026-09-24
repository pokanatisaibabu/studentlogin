# StudentHub – Student Management System

StudentHub is a **Student Management System** developed using **Java and Spring Boot**. This is my first project using Spring Boot, where I built the backend from scratch and connected it with the frontend on my own.

The project provides basic student management operations such as adding, updating, deleting, retrieving, and viewing student details.

## 🚀 Project Overview

StudentHub follows a simple **Spring MVC architecture** where the frontend communicates with the backend through controller mappings.

The backend was developed using **Java and Spring Boot**, with **Spring Data JPA** used for database operations. The frontend was created using **HTML, CSS, and Thymeleaf**, and the application is connected to a **MySQL database**.

This project was developed to gain practical experience in:

* Java backend development
* Spring Boot
* Spring MVC
* Spring Data JPA
* Hibernate
* MySQL database connectivity
* Thymeleaf
* HTML and CSS
* MVC architecture
* CRUD operations
* Connecting frontend with backend

## 🛠️ Technologies Used

### Backend

* **Java**
* **Spring Boot**
* **Spring MVC**
* **Spring Data JPA**
* **Hibernate**
* **Maven**

### Frontend

* **HTML5**
* **CSS3**
* **Thymeleaf**

### Database

* **MySQL**

### Development Tools

* **Visual Studio Code**
* **Git**
* **GitHub**
* **Maven Wrapper**

## 📦 Dependencies Used

The project uses the following Spring Boot dependencies:

### Spring Web

Used to build the web application and handle HTTP requests through Spring MVC controllers.

```xml
spring-boot-starter-web
```

### Spring Data JPA

Used for database interaction and performing CRUD operations using repositories.

```xml
spring-boot-starter-data-jpa
```

### Thymeleaf

Used as the server-side template engine to connect backend data with HTML pages.

```xml
spring-boot-starter-thymeleaf
```

### MySQL Connector/J

Used to establish a connection between the Spring Boot application and the MySQL database.

```xml
mysql-connector-j
```

### Spring Boot DevTools

Used during development to improve the development experience with automatic application restart.

```xml
spring-boot-devtools
```

### Spring Boot Starter Test

Used for testing the Spring Boot application.

```xml
spring-boot-starter-test
```

## 🏗️ Project Architecture

The project follows a simple layered MVC structure:

```text
Frontend
   ↓
Thymeleaf + HTML + CSS
   ↓
Controller
   ↓
Service
   ↓
Repository
   ↓
Spring Data JPA
   ↓
Hibernate
   ↓
MySQL Database
```

### Controller

The controller handles requests coming from the frontend and maps them to the appropriate operations.

### Service

The service layer contains the application logic and acts as a bridge between the controller and repository.

### Repository

The repository layer communicates with the database using Spring Data JPA.

### Entity

The student entity represents the student data stored in the MySQL database.

## ✨ Features

* Add a new student
* Update student details
* Delete a student
* Retrieve a student by ID
* View all student details
* Student ID validation
* CGPA validation
* Phone number validation
* Duplicate student ID handling
* Success and error pages
* MySQL database integration
* Server-side rendering using Thymeleaf

## 👨‍💻 My Contribution

This project was developed as my **first hands-on Spring Boot project**.

I developed the backend code from scratch and implemented the application logic using Java and Spring Boot. I also independently connected the frontend with the backend and integrated the application with the MySQL database.

The user interface was designed using **HTML and CSS**, with Thymeleaf used to dynamically display backend data on the frontend.

Through this project, I gained practical experience in connecting different layers of a web application:

```text
Frontend → Controller → Service → Repository → Database
```

## 🗄️ Database

The application uses **MySQL** to store student information.

The student data includes:

* Student ID
* Student Name
* CGPA
* Email
* Phone Number
* Department
* Year

## 📁 Project Structure

```text
studentlogin
│
├── src
│   ├── main
│   │   ├── java
│   │   │   └── com.practice.studentlogin
│   │   │       ├── StudentloginApplication.java
│   │   │       ├── StudentController.java
│   │   │       ├── StudentService.java
│   │   │       ├── StudentRepository.java
│   │   │       ├── StudentDetails.java
│   │   │       └── ViewController.java
│   │   │
│   │   └── resources
│   │       ├── static
│   │       │   └── css
│   │       │       └── style.css
│   │       │
│   │       ├── templates
│   │       │   ├── home.html
│   │       │   ├── LoginSucess.html
│   │       │   ├── updateStudent.html
│   │       │   ├── retrieveData.html
│   │       │   ├── delete.html
│   │       │   └── allStudents.html
│   │       │
│   │       └── application.properties
│   │
│   └── test
│
├── pom.xml
├── mvnw
├── mvnw.cmd
├── .gitignore
└── README.md
```

## ▶️ How to Run the Project

### 1. Clone the repository

```bash
git clone git@github.com:pokanatisaibabu/studentlogin.git
```

### 2. Open the project

Open the project in an IDE such as Visual Studio Code or IntelliJ IDEA.

### 3. Configure MySQL

Create the required MySQL database and update the database configuration in:

```text
src/main/resources/application.properties
```

### 4. Run the application

Using Maven Wrapper:

```bash
./mvnw spring-boot:run
```

On Windows:

```cmd
mvnw.cmd spring-boot:run
```

The application can then be accessed through the configured localhost port.

## 📌 Future Improvements

Some possible improvements for future versions include:

* User authentication and authorization
* Improved exception handling
* REST API integration
* Pagination and sorting
* Search functionality
* Improved validation
* Responsive UI
* Deployment to a cloud platform

## 📚 What I Learned

This project helped me understand how a Java backend application works in a practical environment.

Some of the key concepts I learned include:

* Creating a Spring Boot application
* Creating controllers and handling requests
* Implementing service-layer logic
* Using Spring Data JPA repositories
* Working with Hibernate
* Connecting Spring Boot with MySQL
* Using Thymeleaf to display backend data
* Performing CRUD operations
* Connecting frontend pages with backend controllers
* Organizing a project using MVC architecture
* Using Maven for dependency management
* Using Git and GitHub for version control

## 🔗 GitHub Repository

[StudentHub – GitHub Repository](https://github.com/pokanatisaibabu/studentlogin)

---

### Author

**Saibabu**

This project represents my first complete hands-on project using **Java Spring Boot**, developed independently to strengthen my backend development and full-stack development fundamentals.
