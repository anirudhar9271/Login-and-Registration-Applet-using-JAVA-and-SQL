# Login and Registration Applet using Java and SQL

A Java Swing application for user login, registration, and employee detail entry using MySQL as the backend database.

## Features

- User login screen
- New user registration screen
- Password confirmation during registration
- Employee details form
- Automatic creation of the required MySQL database and tables
- JDBC-based database connection using MySQL

## Project Structure

```text
.
├── App.java
├── Database/
│   └── Database.java
├── Pages/
│   ├── DetailsPage.java
│   ├── Login.java
│   └── RegisterPage.java
└── README.md
```

## Prerequisites

Before running the project, make sure you have:

- Java JDK 8 or later
- MySQL Server installed and running
- MySQL Connector/J JDBC driver
- A MySQL user with access to the local database server

The application is configured to connect with:

- Host: localhost
- Port: 3306
- Username: root
- Password: root

> If your MySQL credentials are different, update the connection strings in the Java files before running the app.

## Database Setup

The project automatically creates the database and tables if they do not already exist:

- Database: `details`
- Table 1: `logindetails`
- Table 2: `det`

The database initialization logic is implemented in [Database/Database.java](Database/Database.java).

## Compile the Project

From the project root, compile all Java files:

### Windows

```powershell
javac -cp ".;mysql-connector-j-*.jar" -d . App.java Database\Database.java Pages\*.java
```

### Linux / macOS

```bash
javac -cp ".:mysql-connector-j-*.jar" -d . App.java Database/Database.java Pages/*.java
```

If your MySQL Connector/J JAR is named differently, replace the wildcard with the exact file name.

## Run the Application

### Windows

```powershell
java -cp ".;mysql-connector-j-*.jar" ProjectJAVA.App
```

### Linux / macOS

```bash
java -cp ".:mysql-connector-j-*.jar" ProjectJAVA.App
```

This will launch the login page.

## How the App Works

1. The application starts in [App.java](App.java).
2. [Database/Database.java](Database/Database.java) checks whether the MySQL database exists and creates it if needed.
3. [Pages/Login.java](Pages/Login.java) handles login and redirects to registration or the details page.
4. [Pages/RegisterPage.java](Pages/RegisterPage.java) registers new users in the `logindetails` table.
5. [Pages/DetailsPage.java](Pages/DetailsPage.java) stores employee information in the `det` table.

## Notes

- The app uses Swing for the GUI.
- A MySQL server must be running before launching the app.
- You may need to add the JDBC driver jar to your classpath.
- For production use, it is recommended to move database credentials out of source code and use secure configuration methods.

## License

This project is provided for educational and learning purposes.
