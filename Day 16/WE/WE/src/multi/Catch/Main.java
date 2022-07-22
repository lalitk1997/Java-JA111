package multi.Catch;

public class Main {
    public static void main(String[] args) {
        try{
            System.out.println("Start of try...");
            int a[] = new int[5];
            // ARRAYINDEXOUTOFBOUNDS EXCEPTION
            // ARITHEMATIC EXCEPTION
            a[6] = 100/0;
            System.out.println("End of try...");
        }catch (ArithmeticException e){
            System.out.println(e);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }catch(Exception e){
            System.out.println(e);
        }
        System.out.println("Rest of the code...");
    }
}
