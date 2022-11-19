package java_memory_management;

public class UnderstandingStringPool {
    public static void main(String[] args) {

        String name1 = "John";
        String name2 = "Alex";
        String name3 = "John";
        String name4 = "John";
        String name5 = "JOHN";

        System.out.println(name1);
        System.out.println(name2);
        System.out.println(name3);
        System.out.println(name4);
        System.out.println(name5);

        // create as a new object
        String name6 = new String("John");

        System.out.println(name1 == name3); // comparing location true
        System.out.println(name1 == name6); // different location because name6 is created as an object explicitly
        System.out.println(name1.equals(name6)); // comparing if they equal
    }
}
