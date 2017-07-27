import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by choubeyp on 7/22/2017.
 */
public class EmployeeTest {
    public static void main(String[] args) {
        List<Employee> list = Arrays.asList(
                new Employee("Priyal", "Choubey", 123, Location.hyderabad, "HR"),
                new Employee("Ritu", "Johri", 2, Location.hyderabad, "HR"),
                new Employee("Aakriti", "Saxena", 60, Location.hyderabad, "FINANCE"),
                new Employee("Priya", "Shrivastav", 70, Location.hyderabad, "FINANCE"),
                new Employee("Shivani", "Goyal", 13, Location.hyderabad, "FINANCE"),
                new Employee("Shiva", "Gupta", 23, Location.hyderabad, "FINANCE"),
                new Employee("Yash", "Choudhary", 200, Location.hyderabad, "RND"),
                new Employee("Roma", "Chakrobarty", 26, Location.hyderabad, "RND"),
                new Employee("Sohan", "Sharma", 890, Location.hyderabad, "FINANCE"),
                new Employee("Laila", "Mehbub", 29, Location.hyderabad, "RND"),
                new Employee("Rohan", "Jai", 92, Location.pune, "HR"),
                new Employee("Priyal", "Choubey", 4, Location.hyderabad, "HR"),
                new Employee("Ritu", "Johri", 1, Location.hyderabad, "HR"),
                new Employee("Yash", "Choudhary", 37, Location.pune, "RND"),
                new Employee("Priyal", "Choubey", 50, Location.pune, "RND"),
                new Employee("Pingu", "Choubey", 34, Location.pune, "FINANCE"),
                new Employee("Lala", "Choubey", 180, Location.pune, "FINANCE"),
                new Employee("Mela", "Choubey", 15, Location.pune, "FINANCE"),
                new Employee("Sohan", "Choubey", 156, Location.pune, "FINANCE"),
                new Employee("Roma", "Chakrobarthy", 12, Location.pune, "FINANCE")
                );
        Collections.sort(list, new EmployeeComparator());
        for (Employee e : list
             ) {
            System.out.println(e);
        }
    }
}

