/**
 * Basic Singleton.
 */
class Singleton {
    /**
     * Create an object instance of SingleObject
     */
    private static Singleton instance = new Singleton();
    private String error;
    private String debug;

    /**
     * Make the constructor private so that this class cannot be instantiated
     */
    private Singleton() {
        this.error = "Error Message: ";
        this.debug = "Debug Message: ";
    }

    /**
     * Gets instance.
     *
     * @return the instance
     */
    static Singleton getInstance() {
        return instance;
    }

    /**
     * Print message.
     *
     * @param message the message
     * @param type    the type
     */
    void printMessage(String message, String type) {
        if(type.equals("error")) {
            System.out.println(this.error + message);
        } else {
            System.out.println(this.debug + message);
        }

    }
}
