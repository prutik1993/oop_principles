package class_object;

public class Car {
    //default constructor
    public Car(){

    }
    // create 5 args overloaded constructor


    public Car(String color, String made, String model, int year, double price) {
        this.color = color;
        this.made = made;
        this.model = model;
        this.year = year;
        this.price = price;
    }

    // Instance variables
    public String color;
    public String made;
    public String model;
    public int year;
    public double price;

    // Override toString() method

    @Override
    public String toString() {
        return "class_object.Apple.Car{" +
                "color='" + color + '\'' +
                ", made='" + made + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", price=" + price +
                '}';
    }
}
