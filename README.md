# OOP Features in Java

This project demonstrates the four main Object-Oriented Programming (OOP) concepts in Java: **Abstraction**, **Encapsulation**, **Inheritance**, and **Polymorphism**. Each concept is implemented in its own folder with example classes and a main class to run and observe the behavior.

---

## Folder Structure

```
oop-features/
│
├── src/
│   └── oop/
│       ├── abstraction/
│       ├── encapsulation/
│       ├── inheritance/
│       └── polymorphism/
```

---

## Concepts & Examples

### 1. Abstraction

- **Files:** `Sports.java`, `Referee.java`, `Soccer.java`, `Match.java`
- **Description:**  
  Uses interfaces and abstract classes to define the structure of a sport and a referee. The `Soccer` class implements the details, and `Match.java` demonstrates abstraction in action.

### 2. Encapsulation

- **Files:** `Patient.java`, `PatientRecord.java`
- **Description:**  
  The `Patient` class hides its fields using private access and exposes public getters and setters. `PatientRecord.java` shows how to interact with encapsulated data.

### 3. Inheritance

- **Files:** `UserInput.java`, `Employee.java`
- **Description:**  
  `Employee` extends `UserInput`, inheriting its methods and fields. Demonstrates code reuse and extension.

### 4. Polymorphism

- **Files:** `Calculator.java`, `Calc2.java`, `Results.java`
- **Description:**  
  Shows method overloading (compile-time polymorphism) in `Calculator`, and similar method signatures in `Calc2`. `Results.java` demonstrates calling these methods.

---

## How to Run

1. **Compile the code:**
   Open a terminal in the `src/oop` directory and run:
   ```
   javac */*.java
   ```

2. **Run an example:**
   ```
   java abstraction.Match
   java encapsulation.PatientRecord
   java inheritance.Employee
   java polymorphism.Results
   ```

   *(Run the main class in each folder to see the concept in action.)*

---

## Requirements

- Java JDK 8 or higher

---

## Author

- [Brian Ceasar]

---

## License

This project is for educational purposes.