public class FormatFactory {
    public Format getData(String shapeType) {
        if (shapeType == null) {
            return null;
        }
        if (shapeType.equalsIgnoreCase("XML")) {
            return new Xml();

        } else if (shapeType.equalsIgnoreCase("JSON")) {
            return new Json();
        }
        return null;
    }
}
