public class CmdArg {
    public static void main(String[] args) {
        if(args.length == 2){
            int num1 = Integer.parseInt(args[0]);
            int num2 = Integer.parseInt(args[1]);
            System.out.println("This result is "+(num1+num2));
        }else{
            System.out.println("Please supply only two numbers.");
        }
        System.out.println(args[0]);
    }
}
