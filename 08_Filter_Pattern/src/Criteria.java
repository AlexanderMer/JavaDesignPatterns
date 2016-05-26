import java.util.List;

/**
 * Created by Alexander on 18/05/2016.
 */
public interface Criteria {
    List<Person> meetCriteria(List<Person> persons);
}
