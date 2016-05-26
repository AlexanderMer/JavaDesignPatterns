import java.util.List;

/**
 * Created by Alexander on 18/05/2016.
 */
public class AndCriteria implements Criteria{
    private Criteria criteria;
    private Criteria otherCriteria;

    public AndCriteria(Criteria criteria, Criteria otherCriteria) {
        this.criteria = criteria;
        this.otherCriteria = otherCriteria;
    }

    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> firstCriteriaPerons = criteria.meetCriteria(persons);
        return otherCriteria.meetCriteria(firstCriteriaPerons);
    }
}
