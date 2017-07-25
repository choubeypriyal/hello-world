import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by choubeyp on 7/25/2017.
 */
public class Salary {
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();
        list.add(new Employee(5000));
        list.add(new Employee(34000));
        list.add(new Employee(34000));
        list.add(new Employee(45000));
        list.add(new Employee(75000));
        list.add(new Employee(7000));
        list.add(new Employee(5200));
        list.add(new Employee(67000));
        list.add(new Employee(89000));
        list.add(new Employee(10000));
        Iterator<Employee> itr = list.iterator();
        while (itr.hasNext()){
            double sal = itr.next().salary;
            System.out.println(sal* 0.30);
        }


    }
}
