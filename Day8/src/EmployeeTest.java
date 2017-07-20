import org.jetbrains.annotations.NotNull;
import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.Array;
import java.util.*;

/**
 * Created by choubeyp on 7/18/2017.
 */
public class EmployeeTest{
    public static void main(String[] args) {
       // Comparator<Employee> compareIds = new IntComparator(Extractor ext);

        Comparator<Employee> compareName = new NewStringImpl();
        Comparator<Employee> compareDeptId = new DeptIdComparator();

        List<Employee> list =createTestEmployee();

        //Collections.sort(list, compareIds);

        //for (int i = 0; i < list.size(); i++) {
          //  System.out.println(list.get(i));
        //}
        //System.out.println("---------------------");
        Collections.sort(list, compareName);

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println("---------------------");

        Collections.sort(list, compareDeptId);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println("---------------------");

     /*   @Test
        public void TestDeptId(){
            List<Employee> employees = createTestEmployee();
            Collections.sort(list, new DeptIdComparator());
            for (Employee e: employees ) {
                System.out.println(e);
            }
        }*/

        /* MyUtil.sort((ArrayList) list,new CompareImpl());
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        List<Book> listBook = new ArrayList<Book>();

        Book b1 = new Book(100,"Alchemist");
        Book b2 = new Book(400,"Wings ion fire");
        Book b3 = new Book(90,"Alice in the wonderland");

        listBook.add(b1);
        listBook.add(b2);
        listBook.add(b3);

        MyUtil.sort((ArrayList) listBook,new CompareBook());

        for (int i = 0; i < listBook.size(); i++) {
            System.out.println(listBook.get(i));
        }
        */


    }
    @Test

    public void testExtId() {
        List<Employee> employees = createTestEmployee();

        Collections.sort(employees, new IntComparator(new IdExtractor()));
        for (Employee e: employees) {

            System.out.println(e);

        }
    }
    static List<Employee> createTestEmployee(){
        ArrayList<Employee> list = new ArrayList<Employee>();
        list.add(new Employee(100,"Binay",new Date(1994-1900,10-1,22), new Date(2017,7,7), 20));
        list.add(new Employee(150,"Sidharth",new Date(1997-1900,9-1,8), new Date(2017,7,7), 5));
        list.add(new Employee(109,"priya",new Date(1994-1900,11-1,2), new Date(2017,7,7), 2));
        list.add(new Employee(13,"Aakriti",new Date(1992-1900,7-1,6), new Date(2017,7,7), 20));
        list.add(new Employee(290,"Priyal",new Date(1995-1900,3-1,22), new Date(2017,7,7), 10));
        return list;
    }

}
