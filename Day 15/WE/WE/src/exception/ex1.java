package exception;

public class ex1 {
    public static class ex2 {
        public static void main(String[] args) {
            System.out.println("Start...");
            try{
                int data = 100/0;
                System.out.println(data);
            } // Exception : Parent Class
            catch (Exception e){
                System.out.println(e);
            }
            System.out.println("End...");
        }
    }
}
