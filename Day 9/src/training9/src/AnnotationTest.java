/**
 * Created by choubeyp on 7/24/2017.
 */
import java.lang.annotation.*;
public class AnnotationTest {
    @TimeStamp(day = TimeStamp.Day.MONDAY, month = TimeStamp.Month.JULY,year = TimeStamp.Year.YEAR2017)
    public void sum(){
        System.out.println("Iam using this method for annotation");
    }

    @Company(name = "CDK", location = "Pune")
    public AnnotationTest() {
        System.out.println("I am using this constructor for annotation usage :) ");
    }
}
