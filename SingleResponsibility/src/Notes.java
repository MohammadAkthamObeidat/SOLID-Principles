

public class Notes {


    /**
     * ## The simplest definition for Single Responsibility Principle is each class in your system should have only one responsibility.
     *
     * But the question here what exactly constitutes the responsibility? unfortunately there's no precise definition for "Responsibility".
     * So we can say that the above definition is NOT PRACTICAL since the word "Responsibility" may be different from one developer to other.
     *
     * ## Definition through conjunction AND: ==> You should be able to describe what each class does without saying "AND".
     * EX://
     */

    class AuthManager{

        public void login(String userName, String password){

        }

        public void logout(){

        }

        /**
         * Here in AuthManager class I can say the class actually Logs users into the system AND logs users out of the system.
         *                                              OR
         * I can say the AuthManager class handle users authentication.
         *
         * So also the Definition through conjunction AND is NOT PRACTICAL.
         */
    }


    /**
     * # Practical definition for Single Responsibility Principle: ==> Each class should have only one reason to change RIGHT NOW.
     * - Class follows SRP = can't think of more one reason for a class to change.
     *
     * So it's better to define the RESPONSIBILITY = REASON TO CHANGE.
     */

}
