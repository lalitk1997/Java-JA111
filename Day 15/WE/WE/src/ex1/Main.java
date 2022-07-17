package ex1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        int count = 0;
        // Class Pattern --> Method Compile
        Pattern p = Pattern.compile("ab");
        Matcher m = p.matcher("abbbabbaba");
        while (m.find()){
            count++;
            System.out.println(m.start()+m.end()+m.group());
        }
        System.out.println(count);
    }
}
