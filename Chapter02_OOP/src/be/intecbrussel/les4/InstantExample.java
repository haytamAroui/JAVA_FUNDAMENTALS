package be.intecbrussel.les4;
import java.time.Instant;

public class InstantExample {
    public static void main(String[] args) {

        Instant dateAndTime = Instant.now();
        System.out.println(dateAndTime);

        Instant epochDate = Instant.EPOCH;
        System.out.println(epochDate);
    }
}
