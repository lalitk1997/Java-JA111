package Que1;

// EXTENDS EXCEPTION CLASS --> CHECKED EXCEPTION
public class InvalidCountryException extends Exception{
    // PARAMETERIZED CONSTRUCTOR
    public InvalidCountryException(String message){
        super(message);
    }
    // DEFAULT CONSTRUCTOR
    public InvalidCountryException(){}

}
