/**
 * Created by choubeyp on 7/26/2017.
 */
public class Cinema {
    public static void main(String[] args) {
        User user1 = new User(90,"Priyal",2,4);
        User user2 = new User(90,"Priya",22,2);
        User user = new User(90,"Priyal",19,4);

        try{
            MovieService.watch(user1);
            MovieService.watch(user2);
            MovieService.buy(user1,100);
            MovieService.buy(user2, -12);
        } catch(Exception e){
            System.out.println(e.getMessage());
        }


    }
}
