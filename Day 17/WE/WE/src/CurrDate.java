import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class CurrDate {
    public static void main(String[] args) {
        LocalDate dt = LocalDate.now();
        System.out.println("Today's Date : ");
        System.out.println(dt);
        LocalTime tm = LocalTime.now();
        System.out.println("Current Time : ");
        System.out.println(tm);
        LocalDateTime dtm = LocalDateTime.now();
        System.out.println("Current Date & Time : ");
        System.out.println(dtm);
    }
}
