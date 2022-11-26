package access_modifiers.package1;

public class BMD {

    // make, model, year, price

    public String make;
    protected String model;
    int year;
    private double price;

    private void privateMethod(){

    }
    protected void protectedMethod(){

    }
    public void publicMethod(){

    }
    void defaultMethod(){

    }


    public static void main(String[] args) {

        BMD b1 = new BMD();



    }
}
