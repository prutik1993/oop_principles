package mutable_immutable;

public class ReverseString {
    public static void main(String[] args) {
        System.out.println(reverseString("Hello"));
        System.out.println(reverseString("Java"));
        System.out.println(reverseString("Good morning"));
        System.out.println(isPalindrome("Madam"));
        System.out.println(isPalindrome("civic"));
        System.out.println(isPalindrome("hello"));
    }

    /*
    write a method that takes a String and returns it back reversed
     */

    public static String reverseString(String str){
        return new StringBuilder(str).reverse().toString();
    }

    public static boolean isPalindrome(String str){
        return new StringBuilder(str).reverse().toString().equalsIgnoreCase(str);
    }

}
