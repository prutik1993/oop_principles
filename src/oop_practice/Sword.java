package oop_practice;

public class Sword {

    // 1. constructor
    //   public Sword(){ -> default constructor
    //
    //   }
    public Sword(String material){
        this.material = material;
    }
    // Modified constructor
    public Sword(double weight, double length, String name, String material){
        this(material);
        this.weight = weight; // assign the value of local variable in the instance variable
        this.length = length;
        this.name = name;

    }
    // 2. Instance variables

    // Static -> belong to the Class. What does every sword has?
    public static final boolean hasHandle = true;
    public  static boolean isSharp;

    // Noo-static -> belong to the Object. What changing sword by sword?
    public double weight;
    public double length;
    public String name;

    public String material;


    // 3. Methods -> What does sword do? What does every sword do?
    // static -> belong to the Class
    public static void slash(){

        System.out.println("Sword is slashing");
    }

    // non-static belong to the Object. What does every sword do differently?
    // weight * length = 2 pounds * 10 inches = 20 points
    // weight * length = 10 pounds * 15 inches = 150 points
    public void harms(){
        System.out.println("Sword damages = " + (weight * length) + " points.");
    }


    // running only ones before everything
    static{
        System.out.println("Starting the sword making furnace");
    }

    // running  everytime when you create object before everything after static block
    {
        System.out.println("Heating up the furnace");
    }

    @Override
    public String toString() {
        return "Sword{" +
                "weight=" + weight +
                ", length=" + length +
                ", name='" + name + '\'' +
                ", material='" + material + '\'' +
                '}';
    }

    public static void damage(){
        System.out.println(isSharp ? "Sword damage more" : "Sword damage less");
    }


}
