package multi.Catch;

public class Main2 {
    public static void main(String[] args) {
        try{
            int a[] = new int[5];
            a[6] = 30/2;
            System.out.println("Entry of try...");
        }catch (ArithmeticException e){
            System.out.println(e);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }catch (Exception e){
            System.out.println(e);
        }
        System.out.println("Rest of the code...");
    }
}
