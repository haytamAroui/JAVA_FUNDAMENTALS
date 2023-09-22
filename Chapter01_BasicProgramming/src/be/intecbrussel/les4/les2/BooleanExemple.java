package be.intecbrussel.les2;

public class BooleanExemple {
    public static void main(String[] args) {

        int a=10;
        int b=20;

        boolean Equal = (a==b);
        boolean notEqual = (a!=b);
        boolean biggerThan = (a>b);
        boolean smallerThan = (a<b);
        boolean biggerEqual = (a>=b);
        boolean smallerEqual = (a<=b);

        System.out.println(Equal);
        System.out.println(notEqual);
        System.out.println(biggerThan);
        System.out.println(smallerThan);
        System.out.println(biggerEqual);
        System.out.println(smallerEqual);
    }
}
