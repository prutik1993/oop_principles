package class_object;

public class Animal {

    public String name;
    public int age;
    public boolean isCarnivore;
    public boolean isHerbivore;
    public boolean isOmnivore;
     // public static final boolean isExtinct = true; // if its final you cannot change  it

    public Animal(){

    }

    public Animal(String name, int age, boolean isCarnivore, boolean isHerbivore, boolean isOmnivore) {

        this(name, age); // -> have to be on top of the block/only  one constructor can be added
        this.isCarnivore = isCarnivore;
        this.isHerbivore = isHerbivore;
        this.isOmnivore = isOmnivore;
    }

    @Override
    public String toString() {

        String result = "Animal{" +
            "name='" + name + '\'' +
                    ", age=" + age + '\'';
        if(isCarnivore) result += ", isCarnivore=" + isCarnivore;
        if(isHerbivore) result += ", isHerbivore=" + isHerbivore;
        if(isOmnivore) result += ", isOmnivore=" + isOmnivore;
        result += "}";
        return result;
    }

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override   // Execute the code before whenever an Animal object is garbage collected
               // You will override finalize() method if you would like to execute a block of right
              // after you object is destroyed
    protected void finalize() throws Throwable {
        System.out.println(getClass().getName() + " " + this.name  + " object is destroyed");
    }

    public static void main(String[] args) {

        System.out.println("");
//       Animal a1 = new Animal();
//       Animal a2 = new Animal("Dog",7);
//       Animal a3 = new Animal("Cow",6);
//       Animal a4 = new Animal("Cat",3);

       Animal a5 = new Animal("Tiger",10, true, false, false);
       Animal a6 = new Animal("Cow",5, false, true, false);
       Animal a7 = new Animal("Cat",2, false, false, true);

       System.out.println("\n___________Printing the objects__________\n");
        System.out.println(a5);
        System.out.println(a6);
        System.out.println(a7);








    }
}
