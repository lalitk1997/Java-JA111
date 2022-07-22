package Finally;

public class Main {
    public static void main(String[] args) {
        try{
            int data = 25/5;
            System.out.println(data);
        }catch(NumberFormatException e){
            System.out.println(e);
        }finally {
            System.out.println("Finally block always executed...");
        }
        System.out.println("Rest of the code...");
    }
}
