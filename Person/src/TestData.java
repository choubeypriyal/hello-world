package src;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by choubeyp on 7/20/2017.
 */
public class TestData {
    @Test
    public void TestPerson(){
        List<Person> persons = new ArrayList<>();
        persons.add(new Person("Priyal",'F'));
        persons.add(new Person("Bhoomi",'F'));
        persons.add(new Person("Aditya",'M'));
        persons.add(new Person("Priyal",'M'));
        persons.add(new Person("Bhoomi",'F'));
        persons.add(new Person("Priyal",'F'));
        persons.add(new Person("Priyal",'F'));

        PersonCounter.count((ArrayList)persons);


    }
}
