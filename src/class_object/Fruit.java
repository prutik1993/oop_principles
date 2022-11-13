package class_object;

public class Fruit {
    public static boolean hasColor;
    public static boolean isSweet;
    public String name;
    public String shape;

    {
        System.out.println("This is an instance block");
    }

    static{
        hasColor = true;
        System.out.println("This is a static block");
    }

}
