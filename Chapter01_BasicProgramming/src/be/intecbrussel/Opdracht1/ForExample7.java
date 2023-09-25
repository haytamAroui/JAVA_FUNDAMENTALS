package be.intecbrussel.Opdracht1;
public class ForExample7 {
    public static void main(String[] args) {
        for (int i = 0; i <= 10000; i++) {
            int result = i % 6;
            System.out.println("Deelbaar van 6 is  " + result);
            //System.out.println("Deelbaar van 28 is " + i % 28);
        }
    }
}
