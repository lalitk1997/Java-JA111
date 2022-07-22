package Throw;

public class Main {
    public static void validate(int age){
        if(age < 18){
            ArithmeticException ae = new ArithmeticException("Not-eligible to vote...");
            throw ae;
        }else{
            System.out.println("Eligible to vaote...");
        }
    }

    public static void main(String[] args) {
        validate(20);
        validate(12);
    }
}
