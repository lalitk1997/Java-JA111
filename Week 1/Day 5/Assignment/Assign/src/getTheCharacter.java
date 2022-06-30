import java.util.Scanner;

public class getTheCharacter {
    public static void main(String[] args) {
        System.out.println("Enter String : ");
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        System.out.println("Your input : "+str);
        System.out.println("Enter index value : ");
        int idx =  input.nextInt();
        System.out.println("Char at input idx is : "+str.charAt(idx));
    }
}
