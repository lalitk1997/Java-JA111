public class Main {
    String message = "Hello! My name is Lalit Kumar";
    String msg = new String("Using new keyword");
    String s1 = "Welcome";
    String s2 = "Welcome";
    String s3 = new String("Welcome");
    String s4 = new String("Welcome");
    byte[] b = {100, 101, 102};
    String str = new String(b);
    StringBuffer str1 = new StringBuffer("Lalit");
    StringBuilder str2 = new StringBuilder("Lalit");
    public static void main(String[] args) {
        Main obj = new Main();
        // System.out.println(obj.message);
        // System.out.println(obj.msg);
        if(obj.s1 == obj.s2){
            System.out.println("Same");
        }else{
            System.out.println("Not Same");
        }

        System.out.println("------------------");
        if(obj.s3 == obj.s4){
            System.out.println("Same");
        }else{
            System.out.println("Not Same");
        }
        System.out.println("------------------");

        System.out.println(obj.b[0]); // array
        System.out.println(obj.str);
        System.out.println("------------------");

        System.out.println(obj.str1);
        System.out.println("------------------");

        System.out.println(obj.str2.length());
        System.out.println(obj.str2.charAt(1));
        System.out.println(obj.str2.substring(2));
        System.out.println(obj.str2.indexOf("L"));
    }
}
