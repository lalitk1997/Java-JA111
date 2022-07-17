package regularexp;

import java.util.regex.Pattern;

public class Main7 {
    public static void main(String[] args) {
        Pattern p = Pattern.compile("\\s");
        String[] str = p.split("Hello, My name is Lalit Kumar");
        for(int i=0; i<str.length; i++){
            System.out.println(str[i]);
        }
    }
}
