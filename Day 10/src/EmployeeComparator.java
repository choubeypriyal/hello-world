import java.util.Comparator;

/**
 * Created by choubeyp on 7/22/2017.
 */
public class EmployeeComparator implements Comparator<Employee> {

    @Override
    public int compare(Employee o1, Employee o2) {
        int i = o1.getLoc().compareTo(o2.getLoc());
        if (i == 0){
            i = o1.getDeptId().compareTo(o2.getDeptId());
        }
        if (i == 0){
            i = o1.getfName().compareTo(o2.getfName());
        }
        if (i == 0){
            i = o1.getlName().compareTo(o2.getlName());
        }
        if (i == 0){
            i = o1.getId()-o2.getId();
        }
        return i;
    }
}
