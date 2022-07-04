public class CommandLineArg {
    public static void factorial(int num){
        if(num == 0 || num == 1){
            System.out.println(1);
        }else{
            int mul = 1;
            for(int i=1; i<=num; i++){
                mul *= i;
            }
            System.out.println(mul);
        }
    }
    public static void main(String[] args) {
        if(args.length == 1){
            factorial(Integer.parseInt(args[0]));
        }else if(args.length == 2){
            factorial(Math.abs(Integer.parseInt(args[0]) - Integer.parseInt(args[1])));
        }else{
            System.out.println("Error");
        }
    }
}
