/**
 * Created by Alexander on 09/05/2016.
 */
public class SingleObject {

    //create an object of SingleObject
    private static SingleObject instance = new SingleObject();

    //make constructor private so that this class cannot be instantiated
    private SingleObject(){}

    //Get the only object available
    public static SingleObject getInstace(){
        return instance;
    }

    public void showMessage(){
        System.out.println("Hello World");
    }
}
