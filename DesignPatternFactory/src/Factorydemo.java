/**
 * Factory Design Pattern demo.
 */
public class FactoryDemo {
    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        Factory formatFactory = new Factory();

        Format json = formatFactory.getData("JSON");

        json.printData();

        Format xml = formatFactory.getData("XML");

        xml.printData();
    }
}
