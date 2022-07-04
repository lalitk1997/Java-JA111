package WE;

public class WE {
    // Static
    static String bankName;
    // Non-Static
    long accountNumber;
    String accountHolderName;
    double balance;

    public static void main(String[] args) {
        WE.bankName = "IDFC";

        WE ac1 = new WE();
        ac1.accountHolderName="Ramesh";
        ac1.accountNumber=1212324;
        ac1.balance=5000;

        WE ac2 = new WE();
        ac2.accountHolderName="Suresh";
        ac2.accountNumber=8492344;
        ac2.balance=7000;

        System.out.println("Account 1 Details : ");
        System.out.println(ac1.accountHolderName+" "+ac1.accountNumber+" "+ac1.balance);
        System.out.println(ac2.accountHolderName+" "+ac2.accountNumber+" "+ac2.balance);
    }
}
