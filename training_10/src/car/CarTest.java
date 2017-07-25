package car;

import java.util.Set;
import java.util.TreeSet;

/**
 * Created by choubeyp on 7/25/2017.
 */
public class CarTest {
    public static void main(String[] args) {

        Object obj = new CarCompareBrand();
        Set<Car> set;
        String choice = "Price";
        if(choice == "Price")
            set = new TreeSet<>();
        else {
            if (choice == "Brand")
                set = new TreeSet<>(new CarCompareBrand());
            else
                set = new TreeSet<>(new CarCompareIds());
        }
        set.add(new Car(123,12,"BMW"));
        set.add(new Car(90,3400000,"Chevrolete"));
        set.add(new Car(67,890000,"Hyundai"));
        set.add(new Car(34,230000,"Maruti"));
        set.add(new Car(94,560000,"Toyota"));
        set.add(new Car(29,120000,"Tata"));
        set.add(new Car(189,45999,"Lambhorgini"));
        set.add(new Car(23,12000,"Mahindra"));
        set.add(new Car(456,3400,"Eicher"));
        set.add(new Car(789,23.000,"Honda"));
        set.add(new Car(234,123499,"Marcedes"));
        set.add(new Car(190,234589,"Alto"));
        set.add(new Car(567,12,"Sedan"));
        set.add(new Car(109,67.00,"Porche"));
        set.add(new Car(435,560000000,"Lilliac"));
        set.add(new Car(290,234,"Alto"));
        set.add(new Car(167,90000,"Maruti"));
        set.add(new Car(839,12345,"Porche"));
        set.add(new Car(208,5678,"Lilliac"));
        set.add(new Car(321,234,"Hyundai"));

        System.out.println(set);
    }
}
