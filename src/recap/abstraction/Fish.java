package recap.abstraction;

public class Fish extends  Creature implements Fin{

    public Fish(String name, int legs, String breathingMethod, String reproducingMethod) {
        super(name, legs, breathingMethod, reproducingMethod);
    }

    public Fish(String name, int legs, String breathingMethod, String reproducingMethod, boolean hasFins) {
        super(name, legs, breathingMethod, reproducingMethod);
        this.hasFins = hasFins;
    }
    public boolean hasFins;

    @Override
    public void swimming(int finAmount) {
    if(hasFins) {System.out.println(name + " is swimming!");
        if(finAmount > 2) System.out.println(name + " swimming super fast");
        else if(finAmount == 2) System.out.println(name + " swimming fast");
        else System.out.println(name + " swimming slow");
    }
    else System.out.println(name + " is not be able to swim!");
    }

    @Override
    public void moving() {
        if(legs == 0) System.out.println(name + " can not walk");
        if(hasFins) System.out.println(name + " is swimming");
        else System.out.println(name + " doesn't have fins cannot swim!");
    }

    @Override
    public void breathing() {
        switch (breathingMethod.toLowerCase()){
            case "lungs":
                System.out.println(name + " is air breathing");
                break;
            case "gills":
                System.out.println(name + " is water breathing");
                break;
            default:
                System.out.println("This breathing method doesn't exist");
        }
        System.out.println(name + " is using gills to use oxygen!");
    }

    @Override
    public void reproduction() {
        switch (reproducingMethod.toLowerCase()){
            case "eggs":
                System.out.println(name + " using eggs for reproduction!");
                break;
            case "giving birth":
                System.out.println(name + " giving birth for reproduction");
                break;
            default:
                System.out.println("This reproduction method doesn't exist");
        }
        System.out.println("Roe is called as fish eggs!");

    }

    public static void main(String[] args) {
        Fish fish = new Fish("Salmon Samantha",0,"gills","eggs",true);

        fish.moving();
        System.out.println();
        fish.breathing();
        System.out.println();
        fish.reproduction();
        System.out.println();
        fish.living();
        System.out.println();
        fish.swimming(1);
        System.out.println();
        fish.swimming(2);
        System.out.println();
        fish.swimming(5);


    }


}
