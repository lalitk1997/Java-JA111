package exception;

public class ex2 {
    public static void main(String[] args) {
        System.out.println("Start...");
        try{
            int a[] = new int[5];
            a[6] = 30;
            System.out.println("End of try...");
        }catch(ArithmeticException e){
            System.out.println(e);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }catch(Exception e){
            System.out.println(e);
        }
        System.out.println("End...");
    }
}
