# Spring MVC Employee Management

A simple **Spring MVC** application that demonstrates the MVC architecture using:
- Controller
- Service
- Repository
- Entity
- Servlet Initializer (Java-based configuration)

This project handles basic employee-related operations and serves as a clean example of how the Spring MVC workflow operates.

---

## 📌 Project Structure

````
src/main/java/com/springmvc/Spring/MVC
│
├── controller
│ └── EmployeeController.java
│
├── entity
│ └── Employee.java
│
├── repository
│ └── EmployeeRepository.java
│
├── service
│ ├── EmployeeService.java
│ ├── EmployeeServiceImpl.java
│ └── ServletInitializer.java
│
└── SpringMvcApplication.java
````


---

## ✅ Technologies Used

- Java 17+ (or your preferred version)
- Spring MVC
- Spring Boot
- Maven
- Tomcat (embedded)
- IntelliJ IDEA

---

## ✅ Features

- Basic Spring MVC structuring
- REST endpoints for Employee operations (GET, POST, etc.)
- Service Layer for business logic
- Repository Layer for data access
- Proper MVC separation
- Java-based Spring configuration (no XML)

---

## 🚀 How to Run the Application

### **1. Clone the repository**
```bash
git clone https://github.com/your-repository.git

cd SpringMVC
2. Navigate to project folder
cd SpringMVC

3. Build the project
mvn clean install

4. Run the application
mvn spring-boot:run

🌐 Endpoints
GET — Home/Test
http://localhost:8080/employee


(Modify based on your actual controller mappings)

📁 Folder Explanation
Folder	Description
controller/	Handles HTTP requests
service/	Contains business logic
repository/	Data access layer
entity/	Model/POJO classes
resources/	Static files, templates, properties
test/	Unit tests
✅ Notes

Project uses Spring Boot with Spring MVC only (no Spring Data JPA unless added).

You may connect a database later (MySQL/PostgreSQL).

📌 Future Enhancements (Optional)

Add database persistence (JPA + MySQL)

Add Thymeleaf templates

Add validation using @Valid

Add exception handling (@ControllerAdvice)

👨‍💻 Author

Andrew Neil Royo
Spring MVC Developer