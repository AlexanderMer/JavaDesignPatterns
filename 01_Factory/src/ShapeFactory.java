/**
 * Created by Alexander on 05/05/2016.
 */
public class ShapeFactory {
    // use getShape method to get object of type
    public Shape getShape(String shapeType){
        if (shapeType == null) return null;
        if (shapeType.equalsIgnoreCase("CIRCLE")) return new Circle();
        else if (shapeType.equalsIgnoreCase("RECTANGLE")) return new Rectangle();
        else if (shapeType.equalsIgnoreCase("SQUARE")) return new Square();
        return null;
    }
}
