import java.time.LocalDate;
import java.time.LocalDateTime;

public class AtTime {
    public static void main(String[] args) {
        LocalDate dt = LocalDate.now();
        // ATTACHING TIME TO DATE FORMAT
        LocalDateTime ldt = dt.atTime(1, 50, 49);
        System.out.println(ldt);
    }
}
