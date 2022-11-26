package oop_principles.encapsulation;

import java.util.Arrays;
import java.util.Comparator;

public class EmployeeClub {
    public static void main(String[] args) {
        Company company1 = new Company("Microsoft","Washington","(000) 123-1234");
        Company company2 = new Company("Apple","California","(000) 000-0000");

        /*
        # employees for Apple -> 2
        # employees for Microsoft -> 4
        # managers -> 1
        # developers -> 3
        # testers -> 2
        # developers work in Microsoft -> 2

        Find the youngest developer -> Jane is the youngest with age = 20
        Find the oldest employee -> John is the oldest with the age = 45
         */

        Employee emp1 = new Employee("John Doe","Manager", 45, company1);
        Employee emp2 = new Employee("Alex Smith","Developer", 40, company2);
        Employee emp3 = new Employee("Jane Doe","Developer", 20, company1);
        Employee emp4 = new Employee("Ryan Smith","Tester", 22, company1);
        Employee emp5 = new Employee("James Reynold","Tester", 30, company2);
        Employee emp6 = new Employee("Matt Morgan","Developer", 40, company1);

        Employee[] employees = {emp1,emp2,emp3,emp4,emp5,emp6};

        System.out.println("\n----------Count Apple and Microsoft employee--------- \n");

        // looping
        int totalAppleEmployee = 0;
        for (Employee employee : employees) {
            if(employee.getCompany().getName().equalsIgnoreCase("Apple"))
                totalAppleEmployee++;
        }
        System.out.println(totalAppleEmployee);
        // Stream
        System.out.println(Arrays.stream(employees).filter(e -> e.getCompany().getName().equals("Microsoft")).count());


        System.out.println("\n----------Count developer employee number--------- \n");

        // Stream
        System.out.println(Arrays.stream(employees).filter(e -> e.getJobPosition().equals("Developer")).count());

        // looping
        int countDevelopers = 0;
        for (Employee employee : employees) {
            if(employee.getJobPosition().equals("Developer"))
                countDevelopers++;
        }
        System.out.println(countDevelopers);

        System.out.println("\n----------Count developer employee number for Microsoft--------- \n");
        // looping
        int developerInMicrosoft = 0;
        for (Employee employee : employees) {
            if(employee.getCompany().getName().equals("Microsoft") &&
            employee.getJobPosition().equals("Developer"))
                developerInMicrosoft++;
        }
        System.out.println(developerInMicrosoft);

        // Stream
        System.out.println(Arrays.stream(employees).
                filter(e -> e.getCompany().getName().equals("Apple") && e.getJobPosition().equals("Tester")).count());

        System.out.println("\n----------Find the oldest developer for Microsoft--------- \n");

      //  Employee oldestMicrosoftEmployee = new Employee();

//        for (Employee employee : employees) {
//            if(employee.getCompany().getName().equals("Microsoft") &&
//            employee.getJobPosition().equals("Developer") &&
//            employee.getAge() > oldestMicrosoftEmployee.getAge())
//                oldestMicrosoftEmployee = employee;
//        }

        Employee oldestMicrosoftEmployee = Arrays.stream(employees).
                filter(e -> e.getCompany().getName().equals("Microsoft")
                && e.getJobPosition().equals("Developer")).max(Comparator.comparingInt(Employee::getAge)).get();


        System.out.println(oldestMicrosoftEmployee.getFullName().split(" ")[0] + " is the oldest " +
               oldestMicrosoftEmployee.getJobPosition() + " working for " +
               oldestMicrosoftEmployee.getCompany().getName() +
               " with the age " + oldestMicrosoftEmployee.getAge());


    }
}
