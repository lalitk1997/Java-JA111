import java.time.LocalDate;
import java.util.Scanner;

public class Methodof {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Year : ");
        int year = in.nextInt();
        System.out.println("Enter Month : ");
        int month = in.nextInt();
        System.out.println("Enter Day : ");
        int day = in.nextInt();
        LocalDate dt = LocalDate.of(year, month, day);
        System.out.println("Entered Date Stamp : ");
        System.out.println(dt);
    }
}
