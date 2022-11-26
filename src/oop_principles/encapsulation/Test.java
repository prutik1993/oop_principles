package oop_principles.encapsulation;

public class Test {
    public static void main(String[] args) {
        AccountHolder accountHolder = new AccountHolder();

        accountHolder.firstName = "John";
        accountHolder.lastName = "Doe";
        accountHolder.address = "Chicago";
        accountHolder.phoneNumber = "(312) 000-0000";

        accountHolder.setSSN("000-00-0000");
        accountHolder.setBalance(123.45);

        System.out.println(accountHolder.getBalance());
        System.out.println(accountHolder.firstName); // 000-00-0000
        System.out.println(accountHolder.getSSN()); // null
        System.out.println(accountHolder);

    }


}
