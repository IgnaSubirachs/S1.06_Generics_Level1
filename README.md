# Level 1 - Java Generics

## 📚 Table of Contents
- [📄 Description - Exercise Statement](#-description---exercise-statement)
- [💻 Technologies Used](#-technologies-used)
- [📋 Requirements](#-requirements)
- [🛠️ Installation](#-installation)
- [▶️ Execution](#-execution)
- [🌐 Deployment](#-deployment)

---

## 📄 Description - Exercise Statement

This project consists of solving the **Level 1** exercises related to **Java Generics** and basic class structures.

**Exercise 1**:  
Create a class called `NoGenericMethods` that stores three arguments of the same type, along with methods to store and retrieve these objects, and a constructor to initialize all three. Verify that the arguments can be passed in any order when calling the constructor.

**Exercise 2**:  
Create a class called `Person` with attributes `name`, `surname`, and `age`. Then, create a class called `GenericMethods` with a **generic method** that accepts three arguments of generic types. The method must simply print the arguments. In the `main()`, call the generic method with different types of parameters (for example: a `Person` object, a `String`, and a primitive type).

---

## 💻 Technologies Used

- Java 17 (or higher)
- IntelliJ IDEA / Eclipse / Visual Studio Code (any Java IDE)
- JDK (Java Development Kit)

---

## 📋 Requirements

- Java JDK version 17 or later installed.
- A Java-compatible IDE installed (IntelliJ, Eclipse, or similar).
- Basic knowledge of Java (classes, methods, constructors, generics).

---

## 🛠️ Installation

1. Clone the repository or download the project files:https://github.com/IgnaSubirachs/S1.06_Generics_Level1.git
2. Open the project in your preferred IDE.
3. Ensure that the project SDK is set to Java 17 (or a compatible version).
4. Compile all Java files (`Persona.java`, `NoGenericMethods.java`, `GenericMethods.java`, `Main.java`, and `Printable.java` if using the advanced version).

---

## ▶️ Execution

1. Run the `Main` class.
2. The console will display:
    - The results of passing parameters in different orders for `NoGenericMethods`.
    - The printing of various types of parameters using the generic method from `GenericMethods`.

---

## 🌐 Deployment

This project is for educational purposes and is intended to be run locally.  
If you wish to deploy it:
- You can package the project into a `.jar` file using Maven or your IDE.
- Deploy the `.jar` file to any Java-supported server or container (like Apache Tomcat for web apps, or simply execute with `java -jar` for console apps).

---