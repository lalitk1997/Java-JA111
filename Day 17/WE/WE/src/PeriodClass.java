import java.time.LocalDate;
import java.time.Period;

public class PeriodClass {
    public static void main(String[] args) {
        LocalDate currDate = LocalDate.now();
        LocalDate dob = LocalDate.of(1997, 06, 02);
        Period diff = Period.between(currDate, dob);
        System.out.println("Age : "+diff);
    }
}
