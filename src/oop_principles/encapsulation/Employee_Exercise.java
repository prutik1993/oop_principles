package oop_principles.encapsulation;

import java.util.ArrayList;
import java.util.Arrays;

public class Employee_Exercise {
    public static void main(String[] args) {

        /* Crate 3 companies
       name, address, phone number
       tesla, california, 123
       USBank, Minnesota, 000
       Verizon, Texas, 111
       */

        Company c1 = new Company("Tesla", "California", "123");
        Company c2 = new Company("USBank", "Minnesota", "000");
        Company c3 = new Company("Verizon", "Texas", "111");

       // create 10 employers
        ArrayList<Employee> employees = new ArrayList<>(Arrays.asList(
                new Employee("Andrii","Developer", 25, c1),
                new Employee("Yildiz","System Architect", 23, c2),
                new Employee("Malek","Developer", 30, c3),
                new Employee("Saeed","Manager",35 ,c3),
                new Employee("Samir", "Tester",20, c2),
                new Employee("Viktoriya", "Designer",30 ,c1),
                new Employee("Ibrahim", "Designer",27 ,c1),
                new Employee("Jeremiah", "Scrum Master", 21 , c2),
                new Employee("Olena","Tester", 29, c3),
                new Employee("Yoanna","Tester", 23, c1)
        ));
        /*
        Write a program to find and report below information

        Employee numbers and each company
        Tesla = 4
        USBank = 3
        Verizon = 3

        Employee numbers for each position

       Tester = 3
       Developer = 2
       Manager = 1
       System architect = 1
       Scrum master = 1
       Designer = 2

       Find youngest
       Youngest tester = Samir with the age of 20
       Youngest developer = Andrii with the age of 25
       Youngest designer = Ibrahim with the age of 27

       Find the company
        Manager = Saeed works at Verizon
        System Architect = Yildiz works at USBank
        Scrum Master = Jeremiah works at USBank

   */
        int teslaEmployees = 0, usbankEmployees = 0, verizonEmployees = 0;
        Employee managerEmployee = new Employee();
        Employee systemArchitectEmployee = new Employee();
        Employee ScrumMasterEmployee = new Employee();

        for (Employee employee : employees) {
            if(employee.getCompany().getName().equals("Tesla")) teslaEmployees++;
            else if(employee.getCompany().getName().equals("USBank"))usbankEmployees++;
            else verizonEmployees++;
        }

        System.out.println("Employee numbers for each company");
        System.out.println("Tesla = " + teslaEmployees);
        System.out.println("USBank = " + usbankEmployees);
        System.out.println("Verizon = " + verizonEmployees);
    }
}
