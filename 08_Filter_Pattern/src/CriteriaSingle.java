import java.util.ArrayList;
import java.util.List;

/**
 * Created by Alexander on 18/05/2016.
 */
public class CriteriaSingle implements Criteria{
    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> singlePersons = new ArrayList<Person>();

        for (Person person: persons) {
            if (person.getGender().equalsIgnoreCase("SINGLE")){
                singlePersons.add(person);
            }
        }

        return singlePersons;
    }
}
