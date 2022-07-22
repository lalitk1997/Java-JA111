
public class Main {
    // Unchecked Exception
    // throw keyword
    public int getPension(int age, int salary) {
        int pension = 0;
        if(age > 40 && age < 100)
            pension = (age * salary)/100;
        else {
            ArithmeticException ae = new ArithmeticException("Invalid Age");
            throw ae;
        }
        return pension;
    }

    public static void main(String[] args) {
        Main obj = new Main();
        System.out.println(obj.getPension(20, 10000));;
    }
}
