import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by choubeyp on 7/27/2017.
 */
public class EmployeeStore {
    public static void main(String[] args) {
        List<Employee> list = Arrays.asList(new Employee(10,"Priyal",20000),
                new Employee(10,"Priyal",40000),
                new Employee(20,"Ritu",46000),
                new Employee(30,"Aakriti",500000),
                new Employee(40,"Priya",900000),
                new Employee(50,"Sidharth",230000),
                new Employee(60,"Aditya",198989),
                new Employee(70,"Binay",678909),
                new Employee(80,"Snigdha",12345),
                new Employee(90,"Sneh",45678),
                new Employee(100,"Bhoomi",109478),
                new Employee(110,"Pranali",345678),
                new Employee(120,"Ishan",7428174),
                new Employee(130,"Rajan",123456),
                new Employee(140,"Arshi",789999),
                new Employee(150,"Mukta",456700),
                new Employee(160,"Sushant",2355),
                new Employee(170,"Harshala",23456),
                new Employee(180,"Harshita",78922),
                new Employee(190,"Kamal",123400),
                new Employee(200,"Nitesh",1));

        List<Employee> richEmployee = new ArrayList<>();

        for (Employee emp: list) {
            if(emp.getSalary() > 40000){
                richEmployee.add(emp);
            }
        }
        Collections.sort(richEmployee);
        System.out.println(richEmployee);

        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        try {
            fos = new FileOutputStream("C:\\Users\\choubeyp\\IdeaProjects\\hello-world\\IO\\Employees.txt");
            oos = new ObjectOutputStream(fos);
            for (Employee emp: richEmployee) {
                oos.writeObject(emp);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try{
                if(oos != null){
                    oos.close();
                }
                if(fos != null){
                    fos.close();
                }
            }catch(IOException e){
                e.printStackTrace();
            }
        }
        richEmployee.clear();
        FileInputStream fis = null;
        ObjectInputStream ois = null;

        try {
            fis = new FileInputStream("C:\\Users\\choubeyp\\IdeaProjects\\hello-world\\IO\\Employees.txt");
            ois = new ObjectInputStream(fis);
            Employee emp = (Employee)ois.readObject();
            while (emp != null){
                richEmployee.add(emp);
                emp = (Employee) ois.readObject();
            }
        } catch (EOFException e) {
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            try{
                if(ois != null){
                    ois.close();
                }
                if(fis != null){
                    fis.close();
                }
            }catch(IOException e){
                e.printStackTrace();
            }
            System.out.println(richEmployee);
        }
        System.out.println(richEmployee.get(1).getSalary());
    }
}
