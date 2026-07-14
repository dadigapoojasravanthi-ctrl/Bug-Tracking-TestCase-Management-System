# 🐞 Bug Tracking & Test Case Management System

A Java-based console application developed using **Java, JDBC, and MySQL** to manage software bugs and test cases efficiently. The system allows users to perform CRUD (Create, Read, Update, Delete) operations on bugs and test cases while storing data in a MySQL database.

---

## 📌 Features

### Bug Management
- Add new bugs
- View all bugs
- Update bug details
- Delete bugs
- Track bug priority and status

### Test Case Management
- Add test cases
- View all test cases
- Update test cases
- Delete test cases
- Associate test cases with bugs

### Database
- MySQL database integration
- JDBC connectivity
- Persistent data storage

---

## 🛠️ Technologies Used

- Java
- JDBC
- MySQL
- Eclipse IDE

---

## 📂 Project Structure

```
Bug-Tracking-TestCase-Management-System/
│
├── src/
│   ├── DBConnection.java
│   ├── Bug.java
│   ├── BugDAO.java
│   ├── TestCase.java
│   ├── TestCaseDAO.java
│   └── Main.java
│
├── database/
│   └── bug_tracking.sql
│
├── README.md
└── .gitignore
```

---

## 🗄️ Database Tables

### Bugs Table

| Column | Description |
|---------|-------------|
| bug_id | Bug ID |
| title | Bug Title |
| description | Bug Description |
| priority | High, Medium, Low |
| status | Open, In Progress, Closed |
| reported_by | Reporter's Name |

### Test Cases Table

| Column | Description |
|---------|-------------|
| test_case_id | Test Case ID |
| bug_id | Related Bug ID |
| test_case_name | Test Case Name |
| expected_result | Expected Output |
| actual_result | Actual Output |
| status | Pass / Fail |

---

## ⚙️ Prerequisites

- Java JDK 8 or above
- Eclipse IDE
- MySQL Server
- MySQL Workbench

---

## 🚀 How to Run

1. Clone this repository

```
git clone https://github.com/yourusername/Bug-Tracking-TestCase-Management-System.git
```

2. Open the project in Eclipse.

3. Create the MySQL database.

4. Import the SQL file.

5. Update database credentials in `DBConnection.java`.

```java
String url = "jdbc:mysql://localhost:3306/bug_tracking";
String user = "root";
String password = "your_password";
```

6. Run `Main.java`.

---

## 💻 Sample Menu

```
====== Bug Tracking System ======

1. Add Bug
2. View Bugs
3. Update Bug
4. Delete Bug

====== Test Case Management ======

5. Add Test Case
6. View Test Cases
7. Update Test Case
8. Delete Test Case

9. Exit
```

---

## 📸 Sample Output

```
Database Connected Successfully!

Bug Added Successfully!

Bug ID : 1
Title : Login Error
Priority : High
Status : Open

Test Case Added Successfully!
```

---

## 📚 Concepts Used

- Core Java
- Object-Oriented Programming (OOP)
- JDBC
- SQL CRUD Operations
- MySQL Database
- Exception Handling
- Modular Programming

---

## 🔮 Future Enhancements

- User Authentication
- Search Bugs
- Filter Bugs by Status
- GUI using Java Swing or JavaFX
- Export Reports
- Role-based Access
- Bug Assignment to Developers

---

## 👩‍💻 Author

**Pooja Sravanthi**

- GitHub: https://github.com/dadigapoojasravanthi-ctrl
- LinkedIn: https://www.linkedin.com/in/pooja-sravanthi-dadiga/

---

## ⭐ If you found this project useful, consider giving it a star!
