package be.intecbrussel.les3.oefening2;

/*Vergelijk deze 2 variabelen: bool01 = true en bool02 = false.
 Gebruik hiervoor alle 3 de logical operators voor.*/

public class oefening2 {

    public static void main(String[] args) {
        boolean bool01 = true;
        boolean bool02 = false;

        boolean result1 = (bool01 && bool02);
        boolean result2 = (bool01 || bool02);
        boolean result3 = (!(bool01 && bool02));

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
    }

}
