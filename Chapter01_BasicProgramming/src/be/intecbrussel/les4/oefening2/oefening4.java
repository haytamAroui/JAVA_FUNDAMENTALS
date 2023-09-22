package be.intecbrussel.les3.oefening2;

/*Maak gebruik van de Assignment Operators op de volgende variabelen.
Ga na wat wel werkt en wat niet. Probeer ze ook te wisselen bijvoorbeeld*/

public class oefening4 {
    public static void main(String[] args) {

        short shortNum = 101;
        float floatNum = 10.99F;
        boolean booVar = true;

        System.out.println("floatNum += shortNum = " + (floatNum += shortNum));// 112.99
        System.out.println("shortNum += floatNum = " + (shortNum += floatNum)); // Fout: kan float niet toewijzen aan short
    }
}
