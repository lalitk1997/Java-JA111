package multi.Catch;

public class Main3 {
    public static void main(String[] args) {
        System.out.println("Start of program....");
        try{
            String str = null;
            // NULLPOINTER EXCEPTION
            System.out.println(str.length());
        }catch (ArithmeticException e){
            System.out.println(e);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }catch (Exception e){
            System.out.println(e);
        }
        System.out.println("Rest of the code...");
    }
}
