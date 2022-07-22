public class Demo4 extends A{
    public Demo4() throws InvalidAgeException  {
        super();
    }
    public static void main(String[] args)  {
        System.out.println("Start of main...");
        try {
            Demo4 d1 = new Demo4();
        } catch (InvalidAgeException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        System.out.println("End of main...");
    }

}