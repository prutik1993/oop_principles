package mutable_immutable;

public class PracticeStringBuilder {
    public static void main(String[] args) {

        StringBuilder city = new StringBuilder("Chicago");
        System.out.println(city);

        String name = "Alex";

        name += "ander";

        System.out.println(name); // Alexander

        city.append("xxx");
        System.out.println(city);

    }
}
