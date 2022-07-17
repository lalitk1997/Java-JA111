package exception;

public class ex3 {
    public static void main(String[] args) {
        System.out.println("Start...");
        try{
            int data = 100/0;
            System.out.println("Result : "+data);
        }catch (ArithmeticException ae){
            System.out.println(ae);
        }
        System.out.println("End...");
    }
}
