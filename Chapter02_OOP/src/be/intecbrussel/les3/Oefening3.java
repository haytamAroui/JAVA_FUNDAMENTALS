package be.intecbrussel.les3;
public class Oefening3 {
    public static void main(String[] args) {
        double result1=(Math.random()*61);
        System.out.println(result1);
        double result2=(Math.round(result1));
        System.out.println(result2);
            if (result2 % 2 == 0) {
                System.out.println("dit getal is even "+ result2);
            } else System.out.println("dit getal is oneven" + result1);
    }
}

