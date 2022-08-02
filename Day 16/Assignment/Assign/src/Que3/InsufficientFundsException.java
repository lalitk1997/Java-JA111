package Que3;

public class InsufficientFundsException extends Exception{

    InsufficientFundsException(String message){
        super(message);
    }

    InsufficientFundsException(){}
}
