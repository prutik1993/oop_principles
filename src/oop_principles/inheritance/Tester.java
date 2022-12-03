package oop_principles.inheritance;

public class Tester extends Person{
    // default constructor
    public Tester(){}
    // 2-arg constructor
    public Tester(String fName, int age){
        super(fName,age);
    }
    // 3-arg constructor
    public Tester(String fName, int age,String DOB){
        super(fName,age,DOB);
    }
    // 4-arg constructor
    public Tester(String fName, int age,String DOB,String SSH){
        super(fName,age,DOB,SSH);
    }
    // 5-arg constructor
    public Tester(String fName, int age,String DOB,String SSH,boolean isAutomationTester){
        super(fName,age,DOB,SSH);
        this.isAutomationTester = isAutomationTester;
    }
    public boolean isAutomationTester;
    public void code(){
        System.out.println("Tester codes");
    }
    // overloading method
    public void code(String language) {
        System.out.println("Tester codes in " + language + " language");
    }
        @Override
        public void eat() {
            System.out.println("Tester eats");
        }
        @Override
        public void sleep(){
            System.out.println("Tester sleeps");
        }

    @Override
    public String toString() {
        return "Tester{" +
                "fName='" + fName + '\'' +
                ", age=" + age +
                ", DOB='" + DOB + '\'' +
                ", SSN='" + getSSN() + '\'' +
                ", isAutomationTester=" + isAutomationTester +
                '}';
    }
}
