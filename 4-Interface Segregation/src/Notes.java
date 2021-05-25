public class Notes {

    /**                                                    ### Interface Segregation Principle (ISP)###
     * # ISP is a principle of least knowledge and information hiding.
     * # Clients shouldn't be forced to depend on methods they don't use.
     * # The main idea about Interface Segregation is to split an interface into multiple interfaces, in which the class will just implement the interface that
     *      contains the needed methods.
     *
     */

    /**
     *                                                ### The Benefits of Interface Segregation Principle ###
     *
     * 1- Explicit and clear dependencies, so no longer clients depends on very generic interface.
     * 2- More readable code without puzzling empty methods.
     * 3- Easily to find all clients which are interested in a specific service.
     * 4- Safe and easy to add a new services in a future.
     */



    /**
     *                                       ### The High Level Benefits of Interface Segregation Principle ###
     *
     * 1- It allows you to communicate what clients DO with their services, in other words instead of depending on big an generic interfaces your clients become
     *      depending on narrowly focused interfaces and you can understand what clients do just by reading list of their dependencies.
     * 2- ISP communicate with clients DON'T DO with their services, once again if you depends on some generic interface then you don't know exactly how a specific
     *      client can use that interface, so when you apply ISP and make your clients depends on a narrowly focused interfaces you also immediately state what
     *      client don't do with their services.
     * 3- ISP restrict what clients can do with their services.
     * 4- Segregated interfaces allows you to segregate functionality if/when it will be needed
     */
}

