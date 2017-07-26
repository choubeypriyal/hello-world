/**
 * Created by choubeyp on 7/26/2017.
 */
public class MovieService {
    static void watch (User user) throws InvalidAge, LowRating {
        if(user.age <0){
            throw new InvalidAge("Invalid age!!");
        } else {
            if (user.age < 10)
                throw new InvalidAge("age is below 10");
            else if (user.age < 20)
                throw new InvalidAge("age is less than 20");
            else if(user.rating < 3)
                throw new LowRating("Rating less than 3!!");
            else
                System.out.println("enjoy the movie with popcorn!!");
        }
    }

    static void buy(User user, double price) throws InvalidAge, InvalidPrice{
        if(price <= 0)
            throw new InvalidPrice("wrong price!!");
        else {
            if (price < 2000)
                throw new InvalidPrice("Price less than 2000!!");
            else if(user.age <0)
                throw new InvalidAge("Invalid age!!");
        }
    }
}
