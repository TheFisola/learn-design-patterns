# Command Design Pattern

**MY UNDERSTANDING**

The command design pattern is used to encapsulate requests as objects, exposing execute and undo methods via commands.

A good example usecase is a Television remote control device;

Examples of actions that can be performed on a remote include:

- Turn Tv On
- Turn Tv Off
- Increase Tv Volume
- Decrease Tv Volume

All these actions will be encapsulated into individual objects(commands) that can be invoked individually or together

**WIKIPEDIA DEFINITION**

In object-oriented programming, the command pattern is a behavioral design pattern in which an object is used to
encapsulate all information needed to perform an action or trigger an event at a later time. This information includes
the method name, the object that owns the method and values for the method parameters.