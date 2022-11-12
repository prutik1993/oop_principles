package class_object;

public class Apple {
    // default constructor is provided by Java to create zero args object
    public Apple(){
        // Each time you create a new object,this block will execute
        System.out.println("This is default constructor");
    }
    // instance variables - fields - states - attributes
    public String color; // null
    public double price; // 0.0
    public String taste; // null

    @Override
    public String toString() {
        return "Apple{" +
                "color='" + color + '\'' +
                ", price=" + price +
                ", taste='" + taste + '\'' +
                '}';
    }
}
