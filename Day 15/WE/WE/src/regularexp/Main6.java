package regularexp;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Main6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Mobile No. : ");
        String str = input.next();
        if(Pattern.matches("[789]{1}[0-9]{9}", str)){
            System.out.println(str+" : is Valid Number");
        }else{
            System.out.println(str+" : is In-Valid Number");
        }
    }
}
