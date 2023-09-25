package be.intecbrussel.les3.Oefening;

/*Schrijf een programma om de oppervlakte van een rechthoek te berekenen.
        De rechthoek is 12,5 cm lang en 7,8 cm breed.
        De uitkomst moet zijn: 97.5 cm2 */

public class oefening1 {
    public static void main(String[] args) {

        float lang = 12.5F;
        float breed = 7.8F;
        float opper = lang * breed;

        System.out.println("de oppervlakte van een rechthoek is " + opper + "cm²");
    }

}
