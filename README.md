# Application used to practice TDD
Following the book 'Scala Test-Driven Development' by Gaurav Sood
***
### Notes
***
**Code smell**\
Any indication on the surface of the program code that hints at a deeper problem.\
There are a few types of code smell:

**Expendable**\
An expendable is something that doesn't need to be there. Removing it makes the code cleaner and more comprehensible.
* Comments - there shouldn't be a need for comments. Code should be simple to understand and tests should act as the documentation.
* Code duplication - don't repeat yourself.
* Insignificant classes - when a class is doing very little.
* Unreachable/dead code - pretty obvious (code that is no longer used, maybe after a refactor).
* Hypothetical platitude - when future implementation and functionality is thought of, i.e. futureproofing the code. **YAGNI** (You ain't gonna need it).

**Couplers**\
Make classes too tightly coupled and therefore untestable in isolation.
* Feature envy - if a method is using another class so extensively, it should just be in the other class.
* Inappropriate intimacy - when a class uses internal fields and methods of another class - not following encapsulation.
* Function chaining - a().b().c().d() means client is responsible for navigation along the class structure.
* Broken class - class is designed to delegate functionality to another, maybe delete the class.