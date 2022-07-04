public class Main1 {
    String message = "Lalit";
    //String newMessage = message.concat(" Welcome");
    StringBuilder str = new StringBuilder("Lalit");
    public static void main(String[] args) {
        Main1 obj = new Main1();
        // obj.message.concat(" Lalit");
        //System.out.println(obj.message);
        //System.out.println(obj.newMessage);

        //System.out.println("------------------");

        //System.out.println(obj.str);
        //System.out.println(obj.str.append(" Kumar"));
        //System.out.println(obj.str);

        //System.out.println("------------------");

        System.out.println(obj.str.equals(obj.message));
    }
}
