package regularexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main2 {
    public static void main(String[] args) {
        Pattern objPtr = Pattern.compile("[abc]");
        Matcher objMtr = objPtr.matcher("a7b@z#9");
        while(objMtr.find()){
            System.out.println(objMtr.group()+" : "+objMtr.start());
        }
    }
}
