package be.intecbrussel.les4;
import java.time.LocalDateTime;
import java.time.Duration;
import java.time.format.DateTimeFormatter;
public class DurationExamlpe {
    public static void main(String[] args) {
        // Duration class

// 2 datums aangemaakt om te kunnen bewerken.
        LocalDateTime ldt = LocalDateTime.now();
        DateTimeFormatter myFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        LocalDateTime oldDate = LocalDateTime.of(2023, 8, 31, 10, 20, 55);

        String formattedDate = ldt.format(myFormatter);

// De methode getSeconds() gaat de seconde berekenen van 1 uur (ofHours(1))
        Duration seconds = Duration.ofHours(24);
        System.out.println(seconds.getSeconds() + " seconds");

// Dit berekend de tijd in seconde tussen de nu en de oude datum die we hebben gecreëerd.
        Duration duration = Duration.between(oldDate, ldt);
        System.out.println(duration.getSeconds() + " seconds");
    }
}
