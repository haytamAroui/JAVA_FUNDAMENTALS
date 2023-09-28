package be.intecbrussel.les4;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatterExample {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        System.out.println("Before Formatting: " + now);
// format van de datum in nummer
        DateTimeFormatter format1 = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

        // format van de datum in letter
        DateTimeFormatter format2 = DateTimeFormatter.ofPattern("E-MMM-yyyy HH:mm:ss");

        String formatDateTime1 = now.format(format1);
        System.out.println("After Formatting: " + formatDateTime1);

        String formatDateTime2 = now.format(format2);
        System.out.println("After Formatting: " + formatDateTime2);
    }
}
