package access_modifiers.package2;

import access_modifiers.package1.BMD;
import access_modifiers.package1.Honda;
import access_modifiers.package1.Toyota;


public class TestPackage2 {
    public static void main(String[] args) {

        Honda h1 = new Honda();
        System.out.println(h1); // location

        BMD b1 = new BMD();
        

       // Tesla t1 = new Tesla(); cannot be accessed as it is default class

      //  Toyota t1 = new Toyota(); constructor can be private but work only in the same class


    }
}
