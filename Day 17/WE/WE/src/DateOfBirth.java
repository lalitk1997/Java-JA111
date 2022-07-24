import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DateOfBirth {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your DOB: (DD-MM-YYYY)");
        String date = in.next();
        try{
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy");
            LocalDate dt = LocalDate.parse(date, dtf);
            System.out.println("Your DOB : "+dt);
        }catch (Exception e){
            System.out.println("Enter date in provided format.");
        }
    }
}
