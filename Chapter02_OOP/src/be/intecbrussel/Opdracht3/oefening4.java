package be.intecbrussel.Opdracht3;
import java.util.Random;
public class oefening4 {
    public static void main(String[] args) {
        int credits = 17;
        do {
            int roll = new Random().nextInt(21);
            System.out.println("You rolled a " + roll);
            if (roll == 13) {
                System.out.println("Congrat! You won ");
                break;
            } else if (roll == 7) {
                credits += 2;
                System.out.println("You won 2 credits! Your credits now is:  " + credits);
            } else
                System.out.println("Sorry, you didn't win.");
                System.out.println("You have " + credits + " credits.");
        } while (credits >= 3);
    }
}
