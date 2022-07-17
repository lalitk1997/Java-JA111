package regularexp;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.next();
        Pattern objPtr = Pattern.compile("ab");
        Matcher objMtc = objPtr.matcher(str);
        int count = 0;
        while(objMtc.find()){
            count++;
            System.out.println(objMtc.group()+" : "+objMtc.start());
        }
        System.out.println("No. of times : "+count);
    }
}
