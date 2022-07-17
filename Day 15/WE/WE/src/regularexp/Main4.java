package regularexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main4 {
    public static void main(String[] args) {
        Pattern p = Pattern.compile("a?");
        Matcher m = p.matcher("abaabaaab");
        while(m.find()){
            System.out.println(m.group()+" : "+m.start());
        }
    }
}
