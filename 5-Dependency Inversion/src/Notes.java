public class Notes {

    /**
     *                                                        ### Dependency Inversion Definition###
     *
     * # Dependency Inversion Principle basically states that High-level modules shouldn't depend on low-level modules. Both are should depend on abstraction.
     * # Also it says that abstraction shouldn't depends on details. Details should depend on abstraction.
     */

    /**                                                                 ### Top Down Design ###
     *
     * ?? What's top down design??
     * - Well, when you design your class and you need to implement some business domain flow, you'll usually dedicate a class to it
     */

    /**
     * # Circular Dependency: it means when there are two classes basically interdependently on each other is called Circular Dependency.
     * # Circular Dependency are really bad, why? Well, because service can be reused by other clients, In the following example, service class is tightly coupled
     *      to one specific client; Therefore, if it contains some kind of a flow that you would like to invoke from other clients as well, that will be impossible;
     *      You can't substitute Client class with ClientTwo class or ClientThree class; Therefore it makes this functionality non-reusable which is obviously not
     *      very good.
     *
     *      In addition please note that when execute doSomething on a client, the flow goes from the client to service and then service invokes
     *          client's doSomethingPhaseTwo method, this means that if you open client class for the first time and try to understand what constitutes this
     *          doSomething flow, that will be quit a bit tricky.
     */
                //TODO:EX:

                public class Client{
                    Service service;

                    public void doSomething(){
                        doSomethingPhaseOne();

                        service.doSomethingAsync(this);
                    }

                    public void doSomethingPhaseOne(){

                    }

                    public void doSomethingPhaseTwo(){

                    }
                }

                public class Service{

                    public void doSomethingAsync(Client client){
                        client.doSomethingPhaseTwo();
                    }
                }
}
