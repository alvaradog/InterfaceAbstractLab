
Objectives for Lab #2:
---------------------
   * Practice using abstraction by creating an Interface super class and
     choosing an appropriate interface name (should be a noun).
   * Practice identifying common behaviors (methods) and placing
     those things in the super class
   * In the files provided many mistakes have been made with regard to proper
     encapsulation (declaring properties private, e.g.) and placement of
     common members. You may have to move some things around, remove things
     and/or create new things to make this work better.
   * Can you think of any other ways to improve on this design?

Instructions for Lab #2:
----------------------
1. Create an interface super class that contains common methods
   to be inherited by the sub-classes that are provided.
2. Modify your sub-classes to take advantage of this inheritance. You will 
   need to implement all methods in the sub classses Remember that Netbeans has
   a wizard to help you with this. You will see a little yellow light bulb
   at the left of the code. Clicking it will let "implement all abstract
   methods". How will you deal with common properties? Remember, Interfaces
   can't habe properties!
3. Fix any and all encapsulation problems.
4. Create a startup class to test your code. In this startup class create and
   use at least one instance of each sub-class.
5. In the startup class document what you think is good or bad about this
   architecture from the perspective of using abstraction and inheritance.
   (Remember, a startup class must have a main method)
6. In your solution when can Liskov Substitution principle be used and when
   is it not possible. Write down your answer by providing a comment in the
   startup class.

