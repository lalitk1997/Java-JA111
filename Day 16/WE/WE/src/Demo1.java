public class Demo1 {
    // checked exception
    // must handle with throws(in main) OR using try catch bloack
    // func declaration mentions exception name compulsory.
    public int getPension(int age, int salary) throws ClassNotFoundException {
        System.out.println("start of getPension..");
        int pension = 0;
        if(age > 40 && age < 100)
            pension = (age * salary)/100;
        else {
            ClassNotFoundException cfe = new ClassNotFoundException("invalid age");
            throw cfe;
        }
        System.out.println("end of getPension..");
        return pension;
    }
    public static void main(String[] args) throws ClassNotFoundException {
        System.out.println("Start of main...");
        Demo d1= new Demo();
        int pen = d1.getPension(10, 8000); // or use try catch block here
        System.out.println("Total pension is :"+pen);
        System.out.println("End of main...");
    }
}
