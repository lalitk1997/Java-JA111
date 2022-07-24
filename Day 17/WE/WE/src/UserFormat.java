import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class UserFormat {
    public static void main(String[] args) {
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        LocalDateTime ldt = LocalDateTime.now();
        System.out.println("Current format : "+ldt);
        String dtStr = ldt.format(fmt);
        System.out.println("String format : "+dtStr);

    }
}
