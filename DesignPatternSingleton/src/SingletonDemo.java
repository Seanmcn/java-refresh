/**
 * Demo of using basic Singleton Class
 */
public class SingletonDemo {
    public static void main(String[] args) {
        //Get the only object available
        Singleton object = Singleton.getInstance();

        //show the message
        object.printMessage("Hello Sean!");

        object.printMessage("Hello yet again Sean!");
    }
}
