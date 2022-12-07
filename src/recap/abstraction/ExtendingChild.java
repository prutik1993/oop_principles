package recap.abstraction;

public class ExtendingChild extends AbstractParent implements OptionalStuff{

    public ExtendingChild(int var1, String var2, boolean var3, int var4) {
        super(var1, var2, var3, var4);
    }

    @Override
    public int getSumOfVar1AndVar4() {
        return var1 + var4;
    }

    @Override
    public String getFirst3Chars() {
        return var2.substring(0,3);
    }

    @Override
    public boolean isPhoneOnOrOff(String sentence) {
        return (sentence.toLowerCase().contains(" on"));
    }

    public static void main(String[] args) {

        ExtendingChild abstractParent = new ExtendingChild(2,"String",true,5);
        System.out.println(abstractParent.var1);
        System.out.println(abstractParent.var4);
        System.out.println("Sum of var1 and var4 = " + abstractParent.getSumOfVar1AndVar4());

        System.out.println(abstractParent.getFirst3Chars());
        System.out.println(abstractParent.isPhoneOnOrOff("My phone is on"));
        System.out.println(abstractParent.isPhoneOnOrOff("My phone is off"));



    }


}
