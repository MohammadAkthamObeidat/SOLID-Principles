public class Notes {

    /**
     *                                                                      ### DEFINITION ###
     *
     * # Open closed principle states that the software entities ( classes, modules, functions, etc. ) should be open for extension, but close for modification.
     *
     * ?? What does mean Open For Extension ??
     * - Inheritance ?
     * - Maybe Polymorphism ?
     * - Adding more code to class?
     *
     * ### Well sounds reasonable for now, I have no problem with that.
     *
     *
     *
     * ?? What does mean Close Fro Modification ??
     * - Well, it's can only mean that no modification of class source code is allowed.
     * ? But how can I refactor my code if I can't change modify the class ?
     * ? How can fix bugs also without changing the source code of my classes ?
     * ? Well, what about requirements changes, so how can I change the behavior of the class without changing its source code ?
     * ? If no class in the codebase changes, how to add new functionality?
     *
     */

    //########################################################################################################################################

    /**
     *                                                                  ### Original Definition ###
     * # Open Closed Principle: modules should be open and closed.
     *
     *                                                             ### Original Definition of "OPEN" ###
     * # A module [ class ] is said open if it is STILL AVAILABLE FOR EXTENSION. For example, it should be possible to expand its set of
     *      operations or add fields to its data structures.
     * # STILL AVAILABLE FOR EXTENSION means as long as you can extend your class through Inheritance, you're all right, your module is open
     *
     *                                                             ### Original Definition of "OPEN" ###
     * # A module [ class ] is said to be closed if it's AVAILABLE FOR USE BY OTHER MODULES. This assumes that the module has been given
     *      a WELL-DEFINED, STABLE DESCRIPTION (its INTERFACE in the sense of information hiding). At the implementation level, closure
     *      for a module also implies that YOU MAY COMPILE IT, perhaps STORE IT IN A LIBRARY, and make it available for others (its clients)
     *      to use.
     * # In other words, a class is closed if you can ship it to your clients, and you don't expect to make any modifications to this
     * specific class, so this definition of the term closed basically amounts to saying that a module is closed once it's mature enough
     * for you to confidently ship it to your clients.
     *
     * # So to summarize it, the original definition of Open Closed Principle basically stated that you should not change the implementation
     *      of your modules after you release them to the clients, and also that the modules the classes that you release, should be
     *      open for extension, so if the client's need to modify the behavior, they should be able to extend your classes, or you yourself
     *      should be able to extend these classes, with new behavior, basically to use inheritance
     */

    //#################################################################################################################################################


    /**
     *                                                             ### Current Definition ###
     * # How is it possible that the behaviors of a module can be modified without changing its source code? Without changing the module,
     *      how can we change what a module does?
     *
     * - The answer is ABSTRACTION. In C# or any other object-oriented programming language (OOPL), it's possible to create abstractions
     *      that are fixed and yet represent an unbounded group of possible behaviors. The abstractions are abstract base classes,
     *      and the unbounded group of possible behaviors are represented by all the possible derivative classes.
     *
     * # It's possible for a module to manipulate an abstraction. Such a module can be closed for modification, since it
     *      depends on an abstraction that is fixed. Yet the behavior of THAT MODULE CAN BE EXTENDED BY CREATING NEW DERIVATIVES
     *      OF THE ABSTRACTION.
     *
     *  ===> So the manin points of the above explanation is that it's about ABSTRACTION and then once you have ABSTRACTION you
     *          basically can extend the behavior of a module by creating new derivatives, new realizations of the abstraction
     *          that you have in place.
     *
     *
     * ####>>> The conclusion is Open Closed Principle depend on stable ABSTRACTIONS and modify system's behavior by providing different
     *              realizations
     *
     * # So Open Closed Principle is the principle the GOVERNS THE USAGE OF POLYMORPHISM in your codebase
     */

    /**
     * IMPORTANT NOTE: By using an ABSTRACTION (Interface || Abstract Class) we are actually use the " Strategy Design Pattern ".
     *
     * ## Strategy Design Pattern is predicated on Open-Closed Principle, It's one of the ways to implement Open-Closed Principle.
     *
     * ANOTHER NOTE: Abstract Factory design pattern is very commonly used to implement open-closed principle
     */

    /**
     *                                                      ## Salary Calculator Example Explanation ##
     * # SalaryCalculator class it depends on TaxCalculator ( Abstraction ), and this abstraction has just three realizations TaxCalculatorFullTime,
     *      TaxCalculatorPartTime & TaxCalculatorFreelance and to obey open-closed principle the SalaryCalculator class should depends on TaxCalculator
     *      abstraction without know anything about the realizations of that abstractions, so to actually get the realizations at the run time
     *      SalaryCalculator will also depends on on TaxCalculatorFactory and this factory knows about the abstraction and knows about the
     *      realizations of that abstraction because it actually needs to construe those, and again that just abstract factory design pattern in action
     *
     *
     * ## Only the factory will change when new realizations of TaxCalculator will be added.
     *
     *
     * ## Open-Closed principle doesn't really mean that no class will be modified in your system, instead open-closed principle basically says you
     *      need to prepare your system for future change in requirements and basically make sure that the scope of these changes will affect utmost
     *      one single class and this affect should be very simple to implement
     */

    /**
     *                                                              ## The cost of Abstraction ##
     *
     * 1- You need to write additional code.
     * 2- Abstraction make your code more complex.
     * 3- Wrong abstraction can be extremely hard to fix later.
     */



}
