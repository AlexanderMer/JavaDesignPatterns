/**
 * Created by Alexander on 09/05/2016.
 */
public abstract class ColdDrink implements Item{
    @Override
    public Packing packaging() {
        return new Bottle();
    }

    @Override
    public abstract float price();
}


