package Que3;

public class Account {
    String accountNumber;
    double balance;

    Account(String accountNumber){
        this.accountNumber = accountNumber;
    }

    void deposit(double amount){
        this.balance += amount;
    }

    void withdraw(double amount) throws InsufficientFundsException{
        if(this.balance >= amount){
            this.balance -= amount;
        }else{
            InsufficientFundsException e = new InsufficientFundsException("Insufficient Funds...");
            throw e;
        }
    }

    public static void main(String[] args)  {
        Account user1 = new Account("IDFC2314009");
        user1.deposit(1000);
        try{
            user1.withdraw(1001);
        }catch (InsufficientFundsException e){
            System.out.println(e.getMessage());
        }
    }
}
