# Proxy Design Pattern

**My Understanding**

The Proxy design pattern is used when you want control, manage or restrict access to a particular object.

**In my example:**

We have school with an internet but want to restrict access to certain social media sites from students

- The StudentProxyInternet class acts as an intermediary between the student and the real internet
- This way access to certain sites can be restricted before calls are made to the real internet

**Wikipedia Definition**

A proxy, in its most general form, is a class functioning as an interface to something else. The proxy could interface
to anything: a network connection, a large object in memory, a file, or some other resource that is expensive or
impossible to duplicate. In short, a proxy is a wrapper or agent object that is being called by the client to access the
real serving object behind the scenes. Use of the proxy can simply be forwarding to the real object, or can provide
additional logic

**Further Description**

So, essentially, proxy is nothing other than a wrapper around a class that has exactly the same access interface as the
original class, so both classes are interchangeable. Proxy class is there to restrict access to the original class. It
can also be used to implement any pre-processing of the request if it’s needed before the original class can be accessed
and implement additional access rules that cannot be added to the original class directly.