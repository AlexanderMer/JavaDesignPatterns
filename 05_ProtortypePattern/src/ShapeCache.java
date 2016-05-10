/**
 * Created by Alexander on 10/05/2016.
 */

import java.util.Hashtable;

public class ShapeCache{

    private static Hashtable<String, Shape> shapeMap = new Hashtable<String, Shape>();

    public static Shape getShape(String shapeID){
        Shape cachedShape = shapeMap.get(shapeID);
        return (Shape) cachedShape.clone();
    }

    //for each shape run database quer and create shape
    //shapeMap.put(shapeKey, shape);
    //for example, we are adding three shapes

    public static void loadCache(){
        Circle circle = new Circle();
        circle.setId("1");
        shapeMap.put(circle.getID(), circle);

        Square square = new Square();
        square.setId("2");
        shapeMap.put(square.getID(), square);

        Rectangle rectangle = new Rectangle();
        rectangle.setId("3");
        shapeMap.put(rectangle.getID(), rectangle);
    }
}
