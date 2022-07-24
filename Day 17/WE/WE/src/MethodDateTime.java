import java.time.LocalDate;

public class MethodDateTime {
    public static void main(String[] args) {
        LocalDate dt = LocalDate.now();
        LocalDate yesterday = dt.minusDays(1);
        LocalDate tomorrow = dt.plusDays(1);

        System.out.println("Today date : "+dt);
        System.out.println("Yesterday Date : "+yesterday);
        System.out.println("Tommorow date : "+tomorrow);
    }
}
