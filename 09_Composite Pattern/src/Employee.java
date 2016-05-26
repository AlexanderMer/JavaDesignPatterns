import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.List;


public class Employee {
    private String name;
    private String dept;
    private int salary;
    private List<Employee> subordinates;

    //constructor

    public Employee(String name, String dept, int salary) {
        this.name = name;
        this.dept = dept;
        this.salary = salary;
        this.subordinates = new ArrayList<Employee>();
    }

    void add(Employee e){
        subordinates.add(e);
    }

    void remove(Employee e){
        subordinates.remove(e);
    }

    public List<Employee> getSubordinates() {
        return subordinates;
    }

    public String toString(){
        return MessageFormat.format("Employee :[ Name {0}, dept {1}, salary {2}]", this.name, this.dept, this.salary);
    }
}
