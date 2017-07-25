package car;

import java.util.Comparator;

/**
 * Created by choubeyp on 7/25/2017.
 */
public class CarCompareBrand implements Comparator<Car> {
    @Override
    public int compare(Car o1, Car o2) {
        return o1.getBrand().compareTo(o2.getBrand());
    }
}
