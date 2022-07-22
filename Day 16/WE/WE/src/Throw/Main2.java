package Throw;

import java.io.IOException;

public class Main2 {
    public static void validate(int age) throws IOException{
            if(age < 18){
                IOException e = new IOException("Not-eligible to vote...");
                throw e;
            }else{
                System.out.println("Eligible to vote...");
            }
    }
    public static void main(String[] args) {
        try{
            validate(17);
        }catch (Exception e){
            System.out.println(e);
        }
        System.out.println("Rest of the code...");
    }
}
