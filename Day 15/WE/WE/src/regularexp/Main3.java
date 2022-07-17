package regularexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main3 {
    public static void main(String[] args) {
        Pattern p = Pattern.compile("\\d");
        Matcher m = p.matcher("a7b k@9");
        while(m.find()){
            System.out.println(m.group()+" : "+m.start());
        }
    }
}
