import com.sun.xml.internal.bind.v2.schemagen.xmlschema.List;

import java.util.ArrayList;

/**
 * Created by choubeyp on 7/19/2017.
 */
public class MyUtil {
        public static ArrayList<Object> sort(ArrayList<Object> list, Compare comp ){
            for (int i = 0; i < list.size(); i++) {
                for (int j = i+1; j < list.size()-1 ; j++) {
                    if((comp.compare(list.get(i), list.get(j))) == 1){
                        Object temp = list.get(j);
                        list.set(j, list.get(i));
                        list.set(i,temp);
                    }
                }
            }
            return list;
        }
}
