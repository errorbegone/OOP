# Object Oriented Programming in Python3 programming language AND Java.
Certainly! Here’s the README with proper Markdown formatting for better readability:

---

# Java Concepts and Code Explanation

## Overview

This Java code demonstrates several fundamental object-oriented programming (OOP) concepts, including polymorphism, inheritance, and abstraction. It also shows how to work with static variables and constructors. Below is a breakdown of the code and explanations of the key concepts.

## Code Breakdown

### Main Class

```java
import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args){
        Person p = new Person("Neal", 24);

        // Polymorphism demo (Runtime)
        p.walk(1);
        p.walk();
    }
}
```

- **Imports**: The code imports `java.io.*` and `java.util.StringTokenizer`, although they are not used in this snippet.
- **Main Method**: The entry point of the Java application. An instance of `Person` is created with the name "Neal" and age 24.
- **Polymorphism Demo**: Demonstrates runtime polymorphism by calling overloaded `walk` methods on the `Person` object.

### Person Class

```java
class Person {
    String name = "None";
    int age = 0; 
    static int cnt = 0;

    // Constructor 1
    Person() {
        cnt++;
    }

    // Constructor 2
    Person(String name) {
        this.name = name;
    }

    // Constructor 3
    Person(String name, int age) {
        this(); // Calls Constructor 1
        this(name); // Calls Constructor 2

        this.name = name;
        this.age = age;
        cnt += 1;
    }

    // Runtime Polymorphism
    void walk() {
        System.out.println(name + " is walking.");
    }

    void walk(int steps) {
        System.out.println(name + " is walking " + steps + " steps.");
    }
}
```

- **Instance Variables**: `name`, `age`, and a static variable `cnt` which tracks the number of `Person` objects created.
- **Constructors**: 
  - **Default Constructor**: Initializes `cnt` and increments it.
  - **Constructor with Name**: Initializes `name` with a given value.
  - **Constructor with Name and Age**: Calls the other constructors and initializes both `name` and `age`, while also updating `cnt`.
- **Methods**: 
  - **`walk` Method**: Overloaded to demonstrate runtime polymorphism. One version of `walk` prints a generic message, while the other prints the number of steps.

### SubscribedPerson Class

```java
class SubscribedPerson extends Person {
    double amt;

    SubscribedPerson(String name, int age, double amount) {
        super(name, age); // Calls the parent constructor
        this.amt = amount; // Initializes the amount
    }

    // Runtime Polymorphism and Method Overriding
    @Override
    void walk() {
        super.walk(); // Calls the walk method of the superclass
        System.out.println("SubscribedPerson is walking");
    }
}
```

- **Inheritance**: `SubscribedPerson` extends `Person`, inheriting its attributes and methods.
- **Constructor**: Initializes `name`, `age`, and an additional attribute `amt`.
- **Method Overriding**: Overrides the `walk` method to extend the functionality of the superclass method.

### Car Class

```java
abstract class Car {
    int speed; 

    abstract void run();
}
```

- **Abstraction**: `Car` is an abstract class with an abstract method `run()`.
- **Purpose of Abstraction**: Hides the complexity of the implementation from the user, allowing subclasses to provide specific implementations of the `run` method. This helps manage complexity and reduce code duplication.

## Key Concepts

- **Polymorphism**: Demonstrated by the `walk` method in `Person` and its override in `SubscribedPerson`. Allows objects to be treated as instances of their parent class while enabling specific implementations in derived classes.
- **Inheritance**: `SubscribedPerson` inherits from `Person`, showing how subclasses can reuse and extend the functionality of base classes.
- **Abstraction**: The `Car` class provides a template for other car types, hiding the implementation details and focusing on what methods a car should have.

This README encapsulates the core concepts illustrated in the code, providing a clear understanding of how Java’s object-oriented principles are applied.

---
