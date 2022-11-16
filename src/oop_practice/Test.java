package oop_practice;

public class Test {
    public static void main(String[] args) {

        System.out.println("\n_____Sword1 is created after this line:_____\n");
        Sword sword1 = new Sword("Iron");
        System.out.println("Sword #1 - " + sword1);

        System.out.println("\n_____Sword2 is created after this line:_____\n");
        Sword sword2 = new Sword(3.5, 15.0, "Long Sword", "Iron");
        System.out.println("Sword #2 - " + sword2);

        System.out.println("\n_____Sword3 is created after this line:_____\n");
        Sword sword3 = new Sword(10, 25.0, "Super long Sword", "Titanium");
        System.out.println("Sword #3 - " + sword3);


        System.out.println("\n_______Working with static values______\n");

        System.out.println(Sword.hasHandle);
        System.out.println(Sword.isSharp);

        Sword.isSharp = true;
        System.out.println(Sword.isSharp);
        Sword.damage();

        Sword.isSharp = false;
        System.out.println(Sword.isSharp);
        Sword.damage();


        Sword.slash();

        System.out.println("\n________Working with non-static methods_______\n");

        sword1.harms();
        sword2.harms();
        sword3.harms();





    }


}
