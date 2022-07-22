// nested try blocks
public class Demo2 {
    public static void main(String[] args)  {
        System.out.println("Start of main...");
        try {
            System.out.println("Inside try 1");
            System.out.println(100/10);
            try {
                System.out.println("inside try2");
                // A a1 = null;
                // a1.funA();
                System.out.println("end of try2..");
            } catch (NullPointerException npe) {
                System.out.println("catch of try2");
            }
            System.out.println("end of try1");
        } catch (Exception e) {
            System.out.println("catch of try1");
        }
        System.out.println("End of main...");
    }

}