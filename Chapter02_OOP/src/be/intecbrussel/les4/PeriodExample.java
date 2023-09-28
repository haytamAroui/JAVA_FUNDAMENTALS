package be.intecbrussel.les4;
import java.time.Period;
import java.time.LocalDate;
import java.time.Month;

public class PeriodExample {
    public static void main(String[] args) {
        // Period class

// Hier kunnen we de dagen instellen
        Period tenDays = Period.ofDays(10);
        System.out.println(tenDays.getDays());

// 2 datums creëren om de volgende bewerking te doen.
        LocalDate oldDate = LocalDate.of(1988, Month.NOVEMBER, 23);
        LocalDate newDate = LocalDate.of(2022, Month.AUGUST, 22);

// check period between dates
        Period period = Period.between(oldDate, newDate);
        System.out.print(period.getYears() + " years,");
        System.out.print(period.getMonths() + " months,");
        System.out.print(period.getDays() + " days");
    }

}
