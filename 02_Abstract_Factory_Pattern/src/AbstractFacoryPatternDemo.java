/**
 * Created by Alexander on 07/05/2016.
 */
/*
 Abstract Factory patterns work around a super-factory which creates other factories.
 This factory is also called as factory of factories.
 This type of design pattern comes under creational pattern as this pattern provides one of the best ways to create an object.
 In Abstract Factory pattern an interface is responsible for creating a factory of related objects without explicitly specifying their classes.
 Each generated factory can give the objects as per the Factory pattern.

 Implementation
 We are going to create a Shape and Color interfaces and concrete classes implementing these interfaces.
 We create an abstract factory class AbstractFactory as next step. Factory classes ShapeFactory and ColorFactory are defined where each factory extends AbstractFactory.
 A factory creator/generator class FactoryProducer is created.

 AbstractFactoryPatternDemo, our demo class uses FactoryProducer to get a AbstractFactory object.
 It will pass information (CIRCLE / RECTANGLE / SQUARE for Shape) to AbstractFactory to get the type of object it needs.
 It also passes information (RED / GREEN / BLUE for Color) to AbstractFactory to get the type of object it needs.
 */

public class AbstractFacoryPatternDemo {
    public static void main(String[] args){
        // get shape factory
        AbstractFactory shapeFactory = FactoryProducer.getFactory("SHAPE");

        //get an object of Shape Circle and call draw method
        Shape shape1 = shapeFactory.getShape("CIRCLE");
        shape1.draw();

        //get an object of Shape Rectangle and call draw method
        Shape shape2 = shapeFactory.getShape("RECTANGLE");
        shape2.draw();

        //get an object of Shape SQUARE and call draw method
        Shape shape3 = shapeFactory.getShape("SQUARE");
        shape3.draw();


        //get a color factory
        AbstractFactory colorFactory = FactoryProducer.getFactory("COLOR");

        //get an object of color Red and call fill method
        Color color1 = colorFactory.getColor("RED");
        color1.fill();

        //get an object of color Green and call fill method
        Color color2 = colorFactory.getColor("GREEN");
        color2.fill();

        //get an object of color Blue and call fill method
        Color color3 = colorFactory.getColor("BLUE");
        color3.fill();

    }
}
