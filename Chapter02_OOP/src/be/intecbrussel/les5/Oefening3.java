package be.intecbrussel.les5;
//Schrijf een programma om je leeftijd te berekenen in dagen, maanden en jaren.
import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
public class Oefening3 {

    public static void main(String[] args) {

     LocalDate oldDate = LocalDate.of(1988, Month.MARCH, 14);
     LocalDate newDate = LocalDate.of(2023, Month.SEPTEMBER, 28);

     Period period = Period.between(oldDate, newDate);
     System.out.println("leeftijd is : "+period.getYears() + " years,"+period.getMonths() + " months,"+period.getDays() + " days");
        }
}
