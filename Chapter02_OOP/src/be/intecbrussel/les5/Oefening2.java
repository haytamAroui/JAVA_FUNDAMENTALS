package be.intecbrussel.les5;
//Schrijf een programma om de tijd en datum te formatteren naar: ma, 22 aug. 2022 14:54:24

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class Oefening2 {
    public static void main(String[] args) {

        DateTimeFormatter format2 = DateTimeFormatter.ofPattern("E-MMM-yyyy HH:mm:ss");
        LocalDateTime oldDate = LocalDateTime.of(2022, 8, 22, 14, 54, 24);

        String formatDateTime2 = oldDate.format(format2);
        System.out.println("After Formatting: " + formatDateTime2);
    }
}
