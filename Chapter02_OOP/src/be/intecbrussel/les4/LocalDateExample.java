package be.intecbrussel.les4;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.LocalDate;

public class LocalDateExample {
    public static void main(String[] args) {

        LocalDate justTheDate = LocalDate.now();
        LocalTime justTheTime = LocalTime.now();
        LocalDateTime dateAndTheTimeNow = LocalDateTime.now();

        System.out.println(justTheDate);
        System.out.println(justTheTime);
        System.out.println(dateAndTheTimeNow);
    }
}
