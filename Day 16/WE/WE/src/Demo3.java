
public class Demo3 {
    public Demo3()throws InvalidAgeException {
        System.out.println("inside constructor of Demo");
    }
    public static void main(String[] args)  {
        System.out.println("Start of main...");
        try {
            Demo3 d1 = new Demo3();
        } catch (InvalidAgeException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        System.out.println("End of main...");
    }

}
