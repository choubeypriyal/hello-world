import java.io.FileWriter;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by choubeyp on 7/27/2017.
 */
public class CreateCars {
    public static void main(String[] args) throws IOException {
        Set<String> set = new HashSet();
        set.add("Maruti");
        set.add("Desire");
        set.add("WagonR");
        set.add("Alto");
        set.add("Porche");
        set.add("Hyundai");

        FileWriter fout = null;
        try{
            fout = new FileWriter("C:\\Users\\choubeyp\\IdeaProjects\\hello-world\\Day8\\cars.txt");
            for (String car: set
                 ) {
                fout.write(car+"\n");
                System.out.println(car);
            }
        } catch(IOException e){
            e.printStackTrace();
        } finally {
            try{
                if(fout!= null) {
                    fout.close();
                }
            } catch(IOException e){
                e.printStackTrace();
            }
        }

    }
}
