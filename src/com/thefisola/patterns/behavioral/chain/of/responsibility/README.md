# Chain Of Responsibility Design Pattern

**MY UNDERSTANDING**

This pattern is used when you have a sequence of actions that you want to perform on a particular object. Each handler
can decide to take action or/and pass the object unto the next handler on the chain

An example could be a financial transaction, for your system to allow User A send money to User B, The request has to
pass through a chain of validations. E.g whether User A has sufficient funds, whether User A's account is active etc.
All these individual validations are "chains". Each with a single responsibility

Benefits:
