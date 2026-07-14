# 🐞 Bug Tracking & Test Case Management System

A **console-based Bug Tracking & Test Case Management System** developed using **Java, JDBC, and MySQL**. The application helps users manage software bugs and test cases by providing features to create, view, search, update, and delete records. It demonstrates the use of **Core Java, JDBC, MySQL, and Object-Oriented Programming (OOP)** concepts in a real-world project.

---

## 📌 Features

### 🐞 Bug Management
- Add a new bug
- View all bugs
- Search bug by ID
- Update bug status
- Delete bug
- Track bug priority (High, Medium, Low)
- Track bug status (Open, In Progress, Resolved, Closed)

### ✅ Test Case Management
- Add a new test case
- View all test cases
- Search test case by ID
- Update test case status
- Delete test case
- Link test cases with bugs
- Track test execution status (Pass, Fail, Blocked)

### 💾 Database Features
- MySQL database integration
- JDBC connectivity
- Persistent data storage
- CRUD operations using SQL
- Foreign key relationship between bugs and test cases

---

## 🛠️ Tech Stack

- **Programming Language:** Java
- **Database:** MySQL
- **Connectivity:** JDBC
- **IDE:** Eclipse
- **Version Control:** Git & GitHub

---

## 📂 Project Structure

```text
BugTrackingSystem/
│
├── src/
│   └── com/
│       └── bugtracker/
│           ├── DBConnection.java
│           ├── Bug.java
│           ├── BugDAO.java
│           ├── TestCase.java
│           ├── TestCaseDAO.java
│           ├── TestConnection.java
│           └── Main.java
│
├── screenshots/
│   ├── main-menu.png
│   ├── add-bug.png
│   ├── view-bugs.png
│   ├── add-testcase.png
│   ├── search-testcase.png
│   ├── update-testcase.png
│   └── delete-testcase.png
│
├── README.md
└── .gitignore
```

---

## 🚀 Getting Started

### Prerequisites

- Java JDK 8 or above
- Eclipse IDE
- MySQL Server
- MySQL Workbench

---

### Clone the Repository

```bash
git clone https://github.com/dadigapoojasravanthi-ctrl/Bug-Tracking-TestCase-Management-System.git
```

---

### Database Configuration

Update the database credentials in `DBConnection.java`.

```java
String url = "jdbc:mysql://localhost:3306/bugtracker";
String user = "root";
String password = "your_password";
```

Create the required database and tables in MySQL before running the application.

---

### Run the Project

1. Open the project in Eclipse.
2. Configure the MySQL database.
3. Add the MySQL JDBC Driver.
4. Run `Main.java`.

---

## 💻 Application Menu

```text
=============================================
BUG TRACKING & TEST CASE MANAGEMENT SYSTEM
=============================================

------------- BUG MODULE -------------

1. Add Bug
2. View All Bugs
3. Search Bug
4. Update Bug Status
5. Delete Bug

---------- TEST CASE MODULE ----------

6. Add Test Case
7. View All Test Cases
8. Search Test Case
9. Update Test Case Status
10. Delete Test Case

11. Exit
```

---

## 📸 Screenshots

### Main Menu

![Main Menu](screenshots/main-menu.png)

### Add Bug

![Add Bug](screenshots/add-bug.png)

### View All Bugs

![View All Bugs](screenshots/view-bugs.png)

### Add Test Case

![Add Test Case](screenshots/add-testcase.png)

### Search Test Case

![Search Test Case](screenshots/search-testcase.png)

### Update Test Case Status

![Update Test Case Status](screenshots/update-testcase.png)

### Delete Test Case

![Delete Test Case](screenshots/delete-testcase.png)

---

## 🎯 Key Concepts Used

- Core Java
- Object-Oriented Programming (OOP)
- JDBC
- MySQL
- SQL CRUD Operations
- Exception Handling
- Menu-Driven Programming
- Modular Programming

---

## 📈 Future Enhancements

- User Authentication
- Search Bugs by Priority
- Assign Bugs to Developers
- Dashboard with Bug Statistics
- Email Notifications
- GUI using Java Swing or JavaFX
- Export Reports (PDF/Excel)

---

## 👩‍💻 Author

**Pooja Sravanthi**

- **GitHub:** https://github.com/dadigapoojasravanthi-ctrl
- **LinkedIn:** https://www.linkedin.com/in/pooja-sravanthi-dadiga-/

---

## ⭐ Support

If you found this project useful, please consider giving it a **⭐ Star** on GitHub.
