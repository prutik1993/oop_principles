package access_modifiers.package1;

public class testPackage1 {
    public static void main(String[] args) {

        Honda h1 = new Honda();
        System.out.println(h1); // location

        Tesla t1 = new Tesla(); // can be created at the same package

        BMD b1 = new BMD();

    }
}
