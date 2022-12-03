package oop_principles.inheritance;

import java.util.ArrayList;
import java.util.Arrays;

public class TesterClub {
    public static void main(String[] args) {

        FrontendTester ft1 = new FrontendTester("Othman",23,"1993","000",true);
        FrontendTester ft2 = new FrontendTester("Anna",29,"1986","333",false);
        BackendTester bt2 = new BackendTester("Maria", 36,"2000","555",false);
        BackendTester bt1 = new BackendTester("John", 45,"1982","111",false);

        Tester[] testers = {ft1,ft2,bt1,bt2}; // polymorphic array

        /*
        manual testers = 3
        automation testers = 1
        average age = 33
         */

        int totalManual = 0;
        int totalAutomation = 0;
        int averageAge = 0;

        for (Tester tester : testers) {
            averageAge += tester.age;
            if(!tester.isAutomationTester) totalManual++;
            else totalAutomation++;
        }
        System.out.println("Manual testers = " + totalManual);
        System.out.println("Automation testers = " + totalAutomation);
        System.out.println("Average age = " + averageAge/(totalManual + totalAutomation));
        //System.out.println("Average age = " + averageAge/testers.length);

        System.out.println("Automation testers = " + Arrays.stream(testers).filter(x -> x.isAutomationTester).count());
        System.out.println("Manual testers = " + Arrays.stream(testers).filter(x -> !x.isAutomationTester).count());


    }
}
