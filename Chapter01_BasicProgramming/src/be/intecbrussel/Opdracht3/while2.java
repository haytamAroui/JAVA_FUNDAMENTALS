package be.intecbrussel.Opdracht3;
//Maak een programma dat alle veelvouden van 3 afdruckt die kleiner zijn dan 50 .
public class while2 {
    public static void main(String[] args) {
        int i = 1;
        while (i * 3 < 50) {
            System.out.println(i * 3);
            i++;
        }
    }
}
// i=1: 1*3<50=true: affiche:3  i=2
//