package Que1;

import java.util.Scanner;

public class UserRegistration extends InvalidCountryException{

    public void registerUser(String username, String userCountry) throws InvalidCountryException{
        if(!userCountry.equals("India")){
            InvalidCountryException exception = new InvalidCountryException("User Outside India cannot be registered..");
            throw exception;
        }else{
            System.out.println("User registration done successfully..");
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        UserRegistration user = new UserRegistration();

        System.out.println("Enter Your name : ");
        String userName = input.next();

        System.out.println("Enter Your Country : ");
        String userCountry = input.next();

        try{
            user.registerUser(userName, userCountry);
        }catch (InvalidCountryException e){
            System.out.println(e.getMessage());
        }
    }
}
