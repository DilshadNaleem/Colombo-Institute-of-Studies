# <span style="font-size: 32px; color: #2E86AB;">🎓 Student Management System</span>

## <span style="font-size: 24px; color: #2E86AB;">📖 Project Overview</span>

<span style="font-size: 16px; line-height: 1.6;">
The **Colombo Institute of Studies Student Management System** is a Java-based application that allows for the management of student records. This system utilizes **Object-Oriented Programming (OOP)** principles to ensure that the code is modular, maintainable, and scalable. This project allows admin to **CRUD** and search for student information.
</span>

---

## <span style="font-size: 24px; color: #2E86AB;">🌟 Features</span>

<div style="font-size: 16px;">

### 👥 Student Management
- <span style="font-size: 16px;">**Add New Student** - Complete student registration</span>
- <span style="font-size: 16px;">**View Student Details** - Comprehensive student information</span>
- <span style="font-size: 16px;">**Update Existing Student Records** - Modify student data</span>
- <span style="font-size: 16px;">**Delete Student Records** - Remove student entries</span>

### 🔍 Search & Filter
- <span style="font-size: 16px;">**Search Student Records** by name or ID</span>
- <span style="font-size: 16px;">**List All Students** - Complete student directory</span>
- <span style="font-size: 16px;">**Filter All Students** - Advanced filtering options</span>

### 🔐 Authentication
- <span style="font-size: 16px;">**Register with Validations** - Secure user registration</span>
- <span style="font-size: 16px;">**Login System** - Role-based access control</span>

</div>

---

## <span style="font-size: 24px; color: #2E86AB;">🛠️ Technologies Used</span>

<div style="font-size: 16px;">

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white)
![Swing](https://img.shields.io/badge/Java_Swing-6DB33F?style=for-the-badge&logo=java&logoColor=white)
![OOP](https://img.shields.io/badge/OOP-Principles-FF6B6B?style=for-the-badge)

- <span style="font-size: 16px;">**Java**: The primary language used for building the system</span>
- <span style="font-size: 16px;">**Object Oriented Programming (OOP)**: Abstraction, Inheritance, Encapsulation and Polymorphism</span>
- <span style="font-size: 16px;">**Java JFrame**: Developing user-friendly interfaces</span>
- <span style="font-size: 16px;">**File Handling**: To persist data between sessions</span>

</div>

---

## <span style="font-size: 24px; color: #2E86AB;">🏗️ Project Structure</span>

<span style="font-size: 16px;">
The project is structured into multiple classes to ensure good OOP practices such as separation of concerns and modularization.
</span>

<div style="font-size: 16px;">

### 🔐 Authentication Layer
- <span style="font-size: 16px;">**Authenticator**: Abstract class for Login Method</span>
- <span style="font-size: 16px;">**User**: DAO and DTOs, including Login()</span>
- <span style="font-size: 16px;">**HR**: DAO and DTOs, including registerNewUser(), ViewAllUsers() methods</span>

### 👥 Entity Management
- <span style="font-size: 16px;">**Department**: Including DAO and DTOs with Custom ID Auto Increment based on records, Including addDepartment(), getProductCategoryName() methods</span>
- <span style="font-size: 16px;">**Employee**: Including DAO and DTOs with Custom ID based on new records, Including AddNewEmployee(), ViewAllEmployee(), SearchEmployeeDetails(), searchEmployee(), updateEmployee(), DeleteEmployee() methods</span>

### 💾 Data Layer
- <span style="font-size: 16px;">**FileSystem**: The backbone of the project which handles data persistence</span>

</div>

---

## <span style="font-size: 24px; color: #2E86AB;">🚀 Getting Started</span>

<span style="font-size: 16px;">
To run the project on your local machine:
</span>

<div style="font-size: 16px;">

### 📥 Step 1: Clone the Repository

```bash
git clone https://github.com/DilshadNaleem/Colombo-Institute-of-Studies.git
cd Colombo-Institute-of-Studies
```

### ⚙️ Step 2: Project Setup

**Prerequisites:**
- Java JDK 8 or higher
- IDE (Eclipse, IntelliJ IDEA, or NetBeans)

**Importing to IDE:**
1. Open your preferred Java IDE
2. Import the project as existing Java project
3. Ensure all source files are in classpath

### 🏃‍♂️ Step 3: Run the Application

**Command Line:**
```bash
javac Main.java
java Main
```

**IDE Method:**
- Locate the main class file
- Run the application directly from your IDE

</div>

---

## <span style="font-size: 24px; color: #2E86AB;">📁 File Structure</span>

```
Colombo-Institute-of-Studies/
├── src/
│   ├── Authenticator.java
│   ├── Department/
│   │   ├── DepartmentDAO.java
│   │   └── DepartmentDTO.java
│   ├── Employee/
│   │   ├── EmployeeDAO.java
│   │   └── EmployeeDTO.java
│   ├── FileSystem.java
│   ├── HR/
│   │   ├── HRDAO.java
│   │   └── HRDTO.java
│   ├── User/
│   │   ├── UserDAO.java
│   │   └── UserDTO.java
│   └── Main.java
├── data/
│   ├── students.dat
│   ├── departments.dat
│   └── users.dat
└── README.md
```

---

## <span style="font-size: 24px; color: #2E86AB;">🤝 Contributing</span>

<span style="font-size: 16px;">
We welcome contributions! Please follow these steps:
</span>

<div style="font-size: 16px;">

1. **Fork the repository**
2. **Create a feature branch** (`git checkout -b feature/AmazingFeature`)
3. **Commit your changes** (`git commit -m 'Add some AmazingFeature'`)
4. **Push to the branch** (`git push origin feature/AmazingFeature`)
5. **Open a Pull Request**

</div>

---

<div align="center">

**Made with ❤️ for Colombo Institute of Studies**

![Java](https://img.shields.io/badge/Java-17%2B-ED8B00?style=for-the-badge&logo=java&logoColor=white)
![License](https://img.shields.io/badge/License-MIT-blue?style=for-the-badge)

</div>
