import java.util.Comparator;

public class IntComparator implements Comparator<Employee> {
    private Extractor ext;
    public IntComparator(Extractor ext) {
        this.ext = ext;
    }
    @Override
    public int compare(Employee o1, Employee o2) {
        return (ext.extractInt(o1) - ext.extractInt(o2));
    }
}
