package be.intecbrussel.les3;
    import java.util.Random;
public class Oefening5 {
    public static void main(String[] args) {
        Random random = new Random();
        for (int i = 0; i < 5; i++) {
            int numbers=random.nextInt();
            System.out.println(numbers);
        }
    }
}


