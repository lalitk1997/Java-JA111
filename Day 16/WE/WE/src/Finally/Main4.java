package Finally;

public class Main4 {
    public static void main(String[] args) {
        try{
            System.out.println("I am in try block ....");
            System.exit(0);
        }catch (Exception e){
            System.out.println(e);
        }finally {
            System.out.println(" Finally block");
        }
    }
}
