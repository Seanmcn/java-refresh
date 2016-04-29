/**
 * Basic Singleton demo.
 */
public class SingletonDemo {
    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        //Get the only object available
        Singleton object = Singleton.getInstance();

        //show the message
        object.printMessage("Cannot find server!", "error");
        object.printMessage("Page took 2.1 seconds to load", "debug");
    }
}