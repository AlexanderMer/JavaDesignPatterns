/**
 * Created by Alexander on 10/05/2016.
 */
public class Circle extends Shape {

    public Circle(){
        type = "Circle";
    }

    @Override
    void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}
