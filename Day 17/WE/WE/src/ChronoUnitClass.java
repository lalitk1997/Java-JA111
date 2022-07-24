import java.awt.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class ChronoUnitClass {
    public static void main(String[] args) {
        LocalDateTime oldDate = LocalDateTime.of(1982, 5, 31, 10, 20, 55);
        LocalDateTime newDate = LocalDateTime.of(2016, 9, 9, 10, 21, 56);
        System.out.println("Old Date : "+oldDate);
        System.out.println("New Date : "+newDate);
        System.out.println(ChronoUnit.YEARS.between(oldDate, newDate)+" : Years");
        System.out.println(ChronoUnit.MONTHS.between(oldDate, newDate)+" : Months");
        System.out.println(ChronoUnit.DAYS.between(oldDate, newDate)+" : Days");
        System.out.println("Adding 3 months to Current Date : ");
        LocalDate dt = LocalDate.now();
        System.out.println("Current Date "+dt);
        LocalDate ldt = dt.plus(3, ChronoUnit.MONTHS);
        System.out.println("After 3 Months : "+ldt);
    }
}
