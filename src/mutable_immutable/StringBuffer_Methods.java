package mutable_immutable;

public class StringBuffer_Methods {
    public static void main(String[] args) {

        StringBuffer sb = new StringBuffer("Hello");

        sb.append(" World");

        sb.insert(5," snowy");

        System.out.println(sb);
    }
}
