<div align="center">
  <h1> ADAPTER  </h1>
</div>

# Code

Simple project representing the adapter design pattern. For this one I created a ""Database"" Class which receives data from a html file that needs to be converted to xml.
<br></br>


# Resume

![image](https://user-images.githubusercontent.com/40416044/145884158-ed60f1b7-86ea-4518-8b41-c620363b5c93.png)


Adapter is a structural design pattern that allows objects with incompatible interfaces to collaborate.

# Definition

The adapter design pattern is one of the twenty-three well-known Gang of Four design patterns that describe how to solve recurring design problems to design flexible and reusable object-oriented software, that is, objects that are easier to implement, change, test, and reuse.

The adapter design pattern solves problems like:

- How can a class be reused that does not have an interface that a client requires?
- How can classes that have incompatible interfaces work together?
- How can an alternative interface be provided for a class?
Often an (already existing) class can't be reused only because its interface doesn't conform to the interface clients require.

The adapter design pattern describes how to solve such problems:

Define a separate adapter class that converts the (incompatible) interface of a class (adaptee) into another interface (target) clients require.
Work through an adapter to work with (reuse) classes that do not have the required interface.
The key idea in this pattern is to work through a separate adapter that adapts the interface of an (already existing) class without changing it.

Clients don't know whether they work with a target class directly or through an adapter with a class that does not have the target interface.


![image](https://user-images.githubusercontent.com/40416044/145885276-3f80b189-27be-4fb5-ae90-8b77cae0491d.png)

This implementation uses inheritance: the adapter inherits interfaces from both objects at the same time. Note that this approach can only be implemented in programming languages that support multiple inheritance, such as C++.



Source: <a href="https://en.wikipedia.org/wiki/Abstract_factory_pattern"> Wikipedia </a> | <a href="https://refactoring.guru/design-patterns/prototype"> Refactoring Guru </a>
