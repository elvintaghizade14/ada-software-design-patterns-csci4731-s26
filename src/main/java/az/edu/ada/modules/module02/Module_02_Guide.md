## Module 2 Guide: Creational Patterns

### Dates:

- **Week #3:** _Feb 03 – Feb 05_
- **Week #4:** _Feb 10 – Feb 12_

### Topics:

- **Lecture 04:** _Singleton: Thread safety and "Anti-Pattern" discussions._
- **Lecture 05:** _Prototype: Object cloning (Deep vs. Shallow copy)._
- **Lecture 06:** _Factory Method: Decoupling object creation._
- **Lecture 07:** _Abstract Factory & Builder: Creating families of objects and handling complex constructors._

### Assignments:

    Lab 1 Assigned: Tuesday, Feb 10.

### Learning Objectives:

By the end of this module, you should be able to:

    - Identify when to use Singleton (and why it is often dangerous).
    - Use Prototype to clone expensive objects.
    - Decouple client code from concrete classes using Factory Method.
    - Construct complex objects step-by-step using Builder.

### Readings:

- _Head First Design Patterns_: Chapter 4 (Factory) & Chapter 5 (Singleton).

### The Architect's Tip:

    Singleton is the most abused pattern. Junior developers use it everywhere to create "Global Variables". 
    Don't do that. Use it only when you strictly need one instance (like a Logger or Config Manager). 
    For everything else, look at Factory.