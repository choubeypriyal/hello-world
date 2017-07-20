import java.util.Comparator;

/**
 * Created by choubeyp on 7/20/2017.
 */

interface Extractor {
    public int extractInt(Employee e);
}
class IdExtractor implements Extractor{

    @Override
    public int extractInt(Employee e) {
        return e.getEmpId();
    }
}
