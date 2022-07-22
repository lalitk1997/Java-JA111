public class Demo {
    // throws keyword
    // unchecked exception
    public int getPension(int age, int salary)throws ArithmeticException {
        System.out.println("start of getPension..");
        int pension = 0;
        if (age > 40 && age < 100)
            pension = (age * salary) / 100;
        else {
            ArithmeticException ae = new ArithmeticException("Invalid Age");
            throw ae;
        }
        System.out.println("end of getPension..");
        return pension;
    }
    public static void main(String[] args) {//-
        System.out.println("Start of main...");
        Demo d1= new Demo();
        try {
            int pen= d1.getPension(10, 8000);//-
            System.out.println("Total pension is :"+pen);
        }catch (ArithmeticException  ae) {
            System.out.println(ae.getMessage());
        }
        System.out.println("End of main...");
    }

}
