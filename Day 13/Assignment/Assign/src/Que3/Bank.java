package Que3;

public class Bank {
    private Bank(){
        System.out.println("Inside private constructor of Bank");
    }
    public static Bank retConst(){
        return new Bank();
    }
}
