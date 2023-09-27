package be.intecbrussel.les3;
import java.util.Random;
public class Oefening6 {
    public static void main(String[] args) {
        Random random = new Random();
        for (int i = 0; i < 6; i++) {
            int numbers = random.nextInt(45);
            System.out.println(numbers);
        }
    }
}