package nested.Try;

public class Main {
    public static void main(String[] args) {
        try{
            try{
                try{
                    int arr[] = {1, 2, 3, 4};
                    System.out.println(arr[10]);
                }catch (ArithmeticException e){
                    System.out.println(e);
                    System.out.println("Inner Catch Block - 1");
                }
            }catch (ArithmeticException e){
                System.out.println(e);
                System.out.println("Inner Catch Block - 2");
            }
        }catch (ArithmeticException e){
            System.out.println(e);
            System.out.println("Inner Catch Block - 3");
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e);
            System.out.println("Inner Catch Block - 4");
        }catch (Exception e){
            System.out.println(e);
            System.out.println("Multi Catch Block..");
        }
    }
}
