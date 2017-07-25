import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by choubeyp on 7/25/2017.
 */
public class SalaryIncrease {
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();
        list.add(new Employee(29000));
        list.add(new Employee(20000));
        list.add(new Employee(56000));
        list.add(new Employee(11000));
        list.add(new Employee(78000));
        list.add(new Employee(13000));
        list.add(new Employee(18000));
        list.add(new Employee(29000));
        list.add(new Employee(10000));
        list.add(new Employee(25000));

        Iterator<Employee> itr = list.iterator();
        while(itr.hasNext()){
            Employee emp = itr.next();
            if (emp.getSalary() < 20000){
                emp.setSalary(emp.getSalary() + emp.getSalary() * 0.20);
                System.out.println(emp.getSalary());
            }
        }

        Iterator<Employee> ptr = list.iterator();
        while(ptr.hasNext()){
            System.out.println(ptr.next());
        }
    }
}
