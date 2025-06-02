# 🎓 Student Management System

A simple web-based Student Management System built using **Java (J2EE), JSP, Servlets**, and **MySQL**.  
This project allows users to perform full CRUD operations (Create, Read, Update, Delete) on student records through a user-friendly web interface.

---

## 🔧 Technologies Used

- 💻 **Frontend**: HTML, CSS, JSP  
- ⚙️ **Backend**: Java, Servlets  
- 🗄️ **Database**: MySQL  
- 🌐 **Server**: Apache Tomcat  
- 🧠 **IDE**: Eclipse IDE

---

## 🚀 Features

- ➕ Add new student
- 📋 View all students
- 📝 Update student details
- ❌ Delete student
- ✅ Input validations
- 👨‍💻 Simple UI for interaction

---

## 📂 Project Setup Instructions

## 1️⃣ Clone the Repository

```bash
git clone https://github.com/Sachinshindeb11/Student_Management.git
```
   
## 2️⃣ 🧩 Import Spring Boot Project in Eclipse

- Open **Eclipse IDE**
- Go to: `File → Import → Maven → Existing Maven Projects`
- Click **Next**
- Browse to the cloned folder `Student_Management`
- Select the root folder that contains `pom.xml`
- Click **Finish**
- Wait for Maven dependencies to resolve (Internet required)



## 3️⃣ Set Up MySQL Database
- Create the MySQL database and table by running the following SQL commands:

```sql
CREATE DATABASE studentdb;

USE studentdb;

CREATE TABLE students (
  id INT PRIMARY KEY AUTO_INCREMENT,
  name VARCHAR(100),
  email VARCHAR(100),
  phone VARCHAR(15)
);
```


## 4️⃣ Configure DB Connection

- Update your `application.properties` or `application.yml` file with your database credentials:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/studentdb
spring.datasource.username=root
spring.datasource.password=your_password
spring.jpa.hibernate.ddl-auto=update
```


## 5️⃣ Run the Spring Boot application

- **Right-click** on the project in **Project Explorer**
- Select `Run As → Spring Boot App`
- **Open your browser and go to:**
-- http://localhost:8080/




## 🤝 Contribution

- Contributions, issues, and feature requests are welcome!  
- Feel free to fork the repo and submit a pull request.

## 📃 License

- This project is licensed under the **MIT License**.  
- See the `LICENSE` file for more details.

  
## 👤 Author

**Sachin Shinde**  
🔗 GitHub: [@Sachinshindeb11](https://github.com/Sachinshindeb11)
