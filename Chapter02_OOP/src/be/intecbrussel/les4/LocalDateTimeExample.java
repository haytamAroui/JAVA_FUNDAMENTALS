package be.intecbrussel.les4;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.Instant;

public class LocalDateTimeExample {
    public static void main(String[] args) {
        System.out.println("now: " + LocalDateTime.now());
        System.out.println("Apr 15, 1994,  11:30am: " + LocalDateTime.of(1994, Month.APRIL, 15, 11, 30));
        System.out.println("now (from Instant): " + LocalDateTime.ofInstant(Instant.now(), ZoneId.systemDefault()));
        System.out.println("6 months from now: " + LocalDateTime.now().plusMonths(6));
        System.out.println("6 months ago: " + LocalDateTime.now().minusMonths(6));
    }
}
