/**
 * Created by choubeyp on 7/21/2017.
 */
public class PersonTest {
    public static void main(String[] args) {
        /*Person p1 = new Person("Ramesh", "M");
        Person p2 = new Person("Priyal", "F");
        Person p3 = null;
        System.out.println(p1.equals(p2));
        System.out.println(p1.equals(p1)); //reflexive

        System.out.println(p2.equals(p1)); //symmetric

        System.out.println(p1.equals(p3)); //transitive
        System.out.println(p2.equals(p3));

        System.out.println(p1.equals(p3));

        System.out.println(p1.hashCode());
        System.out.println(p2.hashCode());
        //System.out.println(p3.hashCode());

        System.out.println(System.identityHashCode(p2));
        // hash map implementation

        HashMap<Integer, String> map = new HashMap<Integer, String>();
        map.put(p1.hashCode() , p1.getName());
        map.put(p2.hashCode() , p2.getName());
        for (Map.Entry<Integer,String> m : map.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }
        //map.forEach(map.Entry);
        System.out.println(Integer.valueOf(1000) == Integer.valueOf(1000));
        System.out.println(Integer.valueOf(1) == Integer.valueOf(1));
        for (int i = 0; i < 200; i++) {
            System.out.println(i);
            System.out.println(Integer.valueOf(i) == Integer.valueOf(i));

        }
*/
        /*
        Pattern p = Pattern.compile("a*b");
        Matcher m = p.matcher("aaaaab");
        System.out.println(m.matches());*/
        String s = "hello hama hama";
        String l = "hello hama hama";
        String name = new String("cdk");
        String name1 = name.intern();
        String name2 = "cdk";
        System.out.println(name == name1);
        System.out.println(name1==name2);
        System.out.println(name == name2);

    }
}
