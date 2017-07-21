/**
 * Created by choubeyp on 7/21/2017.
 */
public class Person {
    private String name;
    private String gender;

    public Person(String name, String gender) {
        this.name = name;
        this.gender = gender;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o){
        if(o == null){
            return false;
        }
        Person p = (Person) o;
        if(this.getName().equalsIgnoreCase(p.getName()) && this.getGender().equalsIgnoreCase(p.getGender())){
            return true;
        } else
            return false;
    }

    @Override
    public int hashCode(){
        int i = this.getName().hashCode() + this.getGender().hashCode();
        return i;
    }

}
