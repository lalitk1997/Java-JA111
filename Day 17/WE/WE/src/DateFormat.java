import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateFormat {
    public static void main(String[] args) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM-dd-yyyy");
        LocalDate ldt = LocalDate.now();
        System.out.println("Before Formatting : "+ldt);
        String dtStr = ldt.format(dtf);
        System.out.println("After Formatting : "+dtStr);
    }
}
