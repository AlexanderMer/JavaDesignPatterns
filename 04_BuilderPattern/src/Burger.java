/**
 * Created by Alexander on 09/05/2016.
 */
public abstract class Burger implements Item{

    @Override
    public Packing packaging() {
        return new Wrapper();
    }
}
