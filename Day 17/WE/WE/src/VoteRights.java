import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class VoteRights {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter DOB: (dd-mm-yyyy)");
        String dob = in.next();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate ld = LocalDate.parse(dob, dtf);
        LocalDate currDt = LocalDate.now();
        int age = Period.between(ld, currDt).getYears();
        System.out.println("Calculated Age : "+age);
        if(age >= 18){
            System.out.println("Eligible to Vote ...");
        }else {
            System.out.println("Not Eligible to Vote ...");
        }
    }
}
