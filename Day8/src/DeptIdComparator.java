import java.util.Comparator;

/**
 * Created by choubeyp on 7/20/2017.
 */
public class DeptIdComparator implements Comparator<Employee> {

    @Override
    public int compare(Employee o1, Employee o2) {
        return (o1.getDeptid() - o2.getDeptid());
    }
}
