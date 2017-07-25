package car;

/**
 * Created by choubeyp on 7/25/2017.
 */
public class Car implements Comparable<Car> {
    private int id;
    private double price;
    private String brand;

    public Car(int id, double price, String brand) {
        this.id = id;
        this.price = price;
        this.brand = brand;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", price=" + price +
                ", brand='" + brand + '\'' +
                '}';
    }

    @Override
    public int compareTo(Car o) {
        return (int) (this.getPrice()- o.getPrice());
    }
}
