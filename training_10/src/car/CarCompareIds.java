package car;

import java.util.Comparator;

/**
 * Created by choubeyp on 7/25/2017.
 */
public class CarCompareIds implements Comparator<Car> {
    @Override
    public int compare(Car o1, Car o2) {
        return o1.getId() - o2.getId();
    }
}
