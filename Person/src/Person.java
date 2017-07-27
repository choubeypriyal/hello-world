package src;

/**
 * Created by choubeyp on 7/20/2017.
 */
public class Person {
    private String Name;
    private char gender;

    public Person(String name, char gender) {
        Name = name;
        this.gender = gender;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Person{" +
                "Name='" + Name + '\'' +
                ", gender=" + gender +
                '}';
    }
}
