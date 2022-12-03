package recap;

public class Dinosaur extends Animal {

    public Dinosaur(String name, int age, double height, double weight, String diet, boolean isExtinct, boolean isAlive) {
        super(name, age, height, weight, diet, isExtinct, isAlive);
    }

    public Dinosaur(String name, int age, double height, double weight, String diet, boolean isExtinct, boolean isAlive,
                    String size, boolean hasSpike) {
        super(name, age, height, weight, diet, isExtinct, isAlive);
        this.size = size;
        this.hasSpike = hasSpike;
    }

    @Override
    public String toString() {
        return "Dinosaur{" +
                "size='" + size + '\'' +
                ", hasSpike=" + hasSpike +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", height=" + height +
                ", weight=" + weight +
                ", diet='" + diet + '\'' +
                ", isExtinct=" + isExtinct +
                (isAlive ? ", age=" + age : "") +
                '}';
    }
    @Override
    public double attack(){
        double damage = weight * height;
        switch (size.toLowerCase()){
            case "big":
                damage *= 3;
                break;
            case "giant":
                damage *= 10;
                break;
        }
        System.out.println(name + " is attacking. It damaged \"" + damage + "\" .");
        System.out.println(hasSpike ? "Animal had spikes the attack was critical!" : "Animal didn't have spikes attack was not critical!");
        return damage;
    }

    public String size;
    public boolean hasSpike;
    public  static  boolean isReptile = true;



    public static void main(String[] args) {
        //Dinosaur dinosaur = new Dinosaur("Trex",6, 8.9,500.3,"Carnivore",false,true);
        //System.out.println(dinosaur);

        Dinosaur dinosaur = new Dinosaur("Trex",6, 8.9,500.3,"Carnivore",false,true,
                "big",true);
        System.out.println(dinosaur);
        dinosaur.attack();

    }
}
