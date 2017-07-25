/**
 * Created by choubeyp on 7/24/2017.
 */
import java.lang.annotation.*;
@Retention(RetentionPolicy.CLASS)
@Target(ElementType.CONSTRUCTOR)
@interface Company {
    String name();
    String location ();
}
