/**
 * Created by Sean on 2016-04-24.
 */
public class FormatFactoryDemo {
    public static void main(String[] args) {
        FormatFactory formatFactory = new FormatFactory();

        Format json = formatFactory.getData("JSON");

        json.printData();

        Format xml = formatFactory.getData("XML");

        xml.printData();
    }
}
