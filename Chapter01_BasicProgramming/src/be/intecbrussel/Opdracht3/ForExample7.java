package be.intecbrussel.Opdracht3;

/*ForExample7: Maak een programma dat alle getallen tussen 0 en 10000
 afdrukt die zowel deelbaar door 6 als door 28. Hint: maak gebruik van de % operator.*/
public class ForExample7 {
    public static void main(String[] args) {
        for (int i = 0; i <= 10000; i++) {
            if (i % 6 == 0 && i % 28 == 0) {
                System.out.println(i);
            }
        }
    }

}
