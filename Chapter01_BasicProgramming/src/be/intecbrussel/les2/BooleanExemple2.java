package be.intecbrussel.les2;

public class BooleanExemple2 {
    public static void main(String[] args) {
        boolean a=true;
        boolean b=false;

        boolean result1=(a&&b);
        boolean result2=(a||b);
        boolean result3=(!(a&&b));
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);

    }
}
