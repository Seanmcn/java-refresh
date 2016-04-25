/*
 * Basic Singleton Class
 */

public class Singleton {
    // Create an object instance of SingleObject
    private static Singleton instance = new Singleton();

    // Make the constructor private so that this class cannot be instantiated
    private Singleton() {
    }

    // Get the only object instance
    public static Singleton getInstance() {
        return instance;
    }

    public void printMessage(String message) {
        System.out.println(message);
    }
}
