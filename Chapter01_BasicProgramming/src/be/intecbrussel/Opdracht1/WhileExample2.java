package be.intecbrussel.Opdracht1;
//Maak een programma dat alle veelvouden van 3 afdruckt die kleiner zijn dan 50 .
public class WhileExample2 {
    public static void main(String[] args) {
        int i = 1;
        while (i * 3 < 50) {
            System.out.println(i * 3);
            i++;
        }
    }
}

