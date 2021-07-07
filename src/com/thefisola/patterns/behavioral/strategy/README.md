# Strategy Design Pattern

**My Understanding**

The Strategy design pattern is used when you want to define a class that can have a list of similar behaviors/algorithms.

**In my example:** 

We have an application that delivers a road map to its users based on the mode of transportation.

- Each route(algorithm) type is defined as a standalone object that implements the strategy interface
- The context class (RoadMap) then exposes method to determine what algorithm(route) to use based on the defined RoadMap type.

**Wikipedia Definition**

The strategy pattern (also known as the policy pattern) is a behavioral software design pattern that enables selecting
an algorithm at runtime. Instead of implementing a single algorithm directly, code receives run-time instructions as to
which in a family of algorithms to use.