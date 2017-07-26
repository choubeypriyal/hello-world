/**
 * Created by choubeyp on 7/26/2017.
 */
public class User {
    int uid;
    String  name;
    int age;
    int rating;

    public User(int uid, String name, int age, int rating) {
        this.uid = uid;
        this.name = name;
        this.age = age;
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "User{" +
                "uid=" + uid +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", rating=" + rating +
                '}';
    }
}
