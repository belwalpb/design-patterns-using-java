# Design Patterns Using Java

Design patterns are like pre-made solutions to common problems in software development that have been discovered and tested over time. We use design patterns because they help us write better code that is easier to maintain, reusable, scalable, and follows best practices. It's like having a toolbox with pre-built tools that we can use to quickly and efficiently solve software development problems.

**Design patterns are used for a variety of reasons:**

1. Maintainability: Design patterns promote a clear and organized code structure, which makes code easier to maintain and modify.

2. Reusability: Design patterns provide solutions that can be reused across different projects and applications, which can save development time and effort.

3. Scalability: Design patterns allow for the development of software that can easily be scaled up or down to meet changing requirements.

4. Interoperability: Design patterns provide a common language and approach to software development, which can help to ensure interoperability between different software systems.

5. Best practices: Design patterns embody best practices in software development and are based on the collective experience and wisdom of seasoned developers.

6. Performance: Some design patterns can improve software performance by optimizing code and reducing resource usage.

Overall, design patterns provide a way to solve common problems in software development using a standardized approach that has been proven to work effectively.

### Some Important Terms Before Design Patterns:

1. Classes


2. Coupling: Coupling is used to determine, how much a class is coupled or dependent on another class.

3. Interfaces: An interface is a contract, which specifies the capabilities that a class should provide.

4. Encapsulation: Encapsulation is about bundling the data and methods that operate on the data within one unit, called as class and hiding the values or state of an object inside a class. Using this, we can prevent our object from going into an invalid state.

5. Abstraction: Abstraction reduces the complexity by hiding the unnecessary details. For Example, a class with name `EmailService` can have method like: `sendEmail`, `authenticate`, `connect` and `disconnect`. So rather than marking all the method public, we will mark only `sendEmail` method `public` and other all methods will be private only, which will be accessed only from inside the same class. By doing this, external classes will only have to deal with `sendEmail` method, rather then getting confused into other methods and their responsibilities.

6. Inheritance: Inheritance is a mechanism for re-using the code. 

7. Polymorphism: It is the ability of an object to take on many forms or ability of an object to work on different scenarios.

8. UML(Unified Modeling Language): It is the official language, which we use to model our systems. It is generally used to represent the classes and their relationships with each other. 
