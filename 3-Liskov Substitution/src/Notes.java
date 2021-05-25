public class Notes {

    /**                                                    ### Liskov Substitution Principle (LSP)###
     *
     * Definition: If "S" is a subtype of "T", then an objects of type "T" should be replaceable with objects of type "S" without altering
     *      any of the desirable properties of the program (correctness, task performed, etc.)
     *
     * ?? Are there specific criteria for replaceability of supertypes by subtypes?
     *
     * ?? Is there a framework we can use to identify LSP violations ahead of time?
     *
     * ?? What's so important about LSP?
     *
     */


    /**
     *                                                          ### LSP History ###
     * # LSP is the only SOLID principle named after a real person (Barbara Liskov).
     * # Subtype: Subclass or realization which can be substituted for the type it extends or implements.
     *
     * ### Quote from Liskov's 1988 paper:
     * - Abstraction can be used to encapsulate potential modifications. For example, suppose we want to a program to run on different
     *      machines. We can accomplish this by inventing abstractions that hide the differences between machines so that to move the
     *      program to a different machine only those abstractions need be reimplemented. A good design principle is to think about
     *      expected modifications and organize the design by using abstractions that encapsulate the changes.
     *
     *
     */


    /**
     *                                                          ### LSP Rules ###
     * # The main point of LSP: Subclassing or implementation doesn't imply subtype relation.
     *
     * 1- Method signature rules:
     *      A- Contravariance of arguments:
     *          - If the subclass implements a method from its superclass, then the number of arguments should be the same.
     *          - The type of each argument in subclass method should be the supertype of the type of the respective argument in superclass method.
     *          # So don't make subclass argument more specific more than the arguments in the superclass!
     *
     *      B- Covariance of result:
     *          - Either both superclass and subclass methods return result, or neither does.
     *          - If there's a result, then the type of the result in the subclass is a subtype of the type of the result in the superclass
     *          # So don't make subclass methods return types more general!
     *
     *      C- Exception rule:
     *          - Exception thrown by a method in the subclass should be contained in the set of exceptions thrown by the respective method in the superclass.
     *
     *      D- Pre Condition rule:
     *          - An assertion about the state of the system before method is called
     *          - Pre-conditions required by methods of a subclass mustn't be stronger than pre-condition required by methods of a superclass.
     *
     *      E- Post Condition rule:
     *          - An assertion about the state of the system after method execution completes.
     *          - Post conditions guaranteed by methods of a subclass mustn't be weaker than post-conditions guaranteed by methods of a superclass
     *
     *      ### The above 5 rules are methods rules, they applied on individual method within subclasses
     *
     *
     * ############################################################################################################################################################
     *
     * 2- Class property rules:
     *      A- Invariant rule:
     *          - An assertion about a specific class property which is always true.
     *          - Invariant guaranteed by a subclass must include all invariants guaranteed by a superclass.
     *
     *          * Invariant is independent of the history, basically invariants are always true, therefore whenever look at some class its its invariants always hold.
     *          * Relatively easy to identify and reason about invariants, because, well, they always hold, they never change.
     *          * However in variants we can't express dynamic properties of class, because once again invariants never change, and constraints rule come in play to
     *              actually compensate for this one last property, basically that invariants can't express dynamic properties
     *
     *      B- Constraint rule:
     *          - An assertion about how class property evolves over time.
     *          - Constraints enforced by a subclass must include all constraints enforced by a superclass.
     *
     *      # The above two rules serve this idea: when you have a client that uses some class and you provide some subclass instead of that class that the client
     *          expects to use
     */


    /**
     *                                                                              ### Summary ###
     *
     * # Subtype: Subclass or realization which can be substituted for the type it extends or implement.
     *      - Substitute means that we can put a subclass instead of its superclass and the behavior and the functionality of the application will not changed.
     *      ? How to know that the functionality of the application will not changed if we replaced a subclass with it's superclass??
     *          - Well, the answer is by applying the method and class rules that discussed in above.
     */
}
