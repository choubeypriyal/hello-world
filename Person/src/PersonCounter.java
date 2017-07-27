package src;

import java.util.ArrayList;

/**
 * Created by choubeyp on 7/20/2017.
 */
public class PersonCounter {
    public static void count(ArrayList<Person> list){
        for (int i = 0; i < list.size(); i++) {
            int count =1;
            String name = list.get(i).getName();
            for (int j = i+1; j < list.size(); j++) {
                if (name.compareToIgnoreCase(list.get(j).getName()) == 0){
                    count++;
                    list.remove(j);
                    j--;
                }
            }
            System.out.println("Person : " + name + "count :" + count);
        }
    }
}
