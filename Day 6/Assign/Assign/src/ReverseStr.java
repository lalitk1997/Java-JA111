public class ReverseStr {
    public static String strRev(String str){
        // System.out.println(str);
        // Doubt
        String revstr = "";
        char ch;
        for(int i=str.length()-1; i>=0; i--){
            //System.out.println(str.charAt(i));
            ch = str.charAt(i);
            revstr = revstr + ch;
        }
        return revstr;

    }
    public static void main(String[] args) {
        System.out.println(strRev("Lalit"));
    }
}
