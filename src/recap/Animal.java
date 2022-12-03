package recap;

public class Animal {


    public Animal(String name, int age, double height, double weight, String diet) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
        this.diet = diet;
    }

    public Animal(String name, int age, double height, double weight, String diet, boolean isExtinct, boolean isAlive) {
        this(name, age, height, weight, diet);
        this.isExtinct = isExtinct;
        this.isAlive = isAlive;
    }

    public String name;
    public int age;
    public double height;
    public double weight;
    public  String diet;
    public boolean isExtinct;
    public boolean isAlive;

    public void eat(String food){
        switch (food){
            case "meat":
            case "animal":
            case "human":
           diet = "carnivore";
                System.out.println(name + " is carnivore");
           break;
            case "lettuce":
            case "plant":
            case "grass":
            case "leaves":
                diet = "herbivore";
                System.out.println(name + " is herbivore");
                break;
            default:
                System.out.println("We don't have diet type foe this food!");


        }
        System.out.println(name + " is eating " + food);
    }

    public void breath(String type){
        if(!isAlive || isExtinct){
            System.out.println(name + " cannot breath");
        }else {
            switch (type) {
                case "Gills":
                    System.out.println(name + " is water breathing");
                    break;
                case "Lungs":
                    System.out.println(name + " is air breathing");
                    break;
                default:
                    System.out.println(name + " breathing unique way");

            }
        }
    }

    public double attack(){
        double damage = weight * height;
         System.out.println(name + " is attacking. It damaged \"" + damage + "\" .");
         return damage;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "{" +
                "name='" + name + '\'' +
                (isAlive ? ", age=" + age : "") +
                ", height=" + height +
                ", weight=" + weight +
                ", diet='" + diet + '\'' +
                ", isExtinct=" + isExtinct +
                ", isAlive=" + isAlive +
                '}';
    }

    public static void main(String[] args) {
//        Animal animal = new Animal();
//        System.out.println("Not alive " + animal);
//        animal.isAlive = true;
//        System.out.println("Alive " + animal);

        Animal animal = new Animal("Trex", 5, 7.4, 400.2, "Carnivore",false,false);
        System.out.println(animal);
//        animal.eat("leaves");
//
//        animal.isAlive = true;
//        animal.isExtinct = false;
//        animal.breath("Lungs");
         animal.attack();
    }
}
