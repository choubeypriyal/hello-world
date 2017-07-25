/**
 * Created by choubeyp on 7/24/2017.
 */
import java.lang.annotation.*;
@Retention(RetentionPolicy.SOURCE)
@Target(ElementType.METHOD)
@interface TimeStamp {
    enum Day{
        MONDAY, TUESDAY, WEDNESDAY, THRUSDAY, FRIDAY, SATURDAY, SUNDAY
    }

    enum Year{
        YEAR2016, YEAR2015, YEAR2017, YEAR2018, YEAR2019, YEAR2020
    }

    enum Month {
        JANUARY, FEBUARY, MARCH, APRIL, MAY, JUNE, JULY, AUGUST, SEPTEMBER, OCTOBER, NOVEMBER, DECEMBER
    }

    Day day();
    Month month();
    Year year();

}
