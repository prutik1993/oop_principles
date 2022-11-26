package oop_principles.encapsulation;

public class AccountHolder {
     String firstName;
     String lastName;
     String address;
     String phoneNumber;
    private String SSN;
    private double balance;


    public double getBalance(){
        return this.balance;
    }

    public void setBalance(double balance){
        this.balance = balance;
    }

    public String getSSN(){
        return this.SSN;
    }

    public void setSSN(String SSN){
        this.SSN = SSN;
    }


    @Override
    public String toString() {
        return "AccountHolder{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", address='" + address + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", SSN='" + SSN + '\'' +
                '}';
    }
}
