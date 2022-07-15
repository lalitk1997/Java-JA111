package Que2;

import java.util.Scanner;

public class IPL {
    public void homeTeamStadium(Stadium stadium){
        if(stadium != null){
            System.out.println("Welcome to ...");
            if(stadium.toString() == "EDEN_GARDENS_STADIUM"){
                System.out.println("“This is the home ground of KKR”");
            }else if(stadium.toString() == "WANKHEDE_STADIUM"){
                System.out.println("“This is the home ground of Mumbai Indians”");
            }else if(stadium.toString() == "CHIDAMBARAM_STADIUM"){
                System.out.println("“This is the home ground of CSK”");
            }else{
                System.out.println("“This is the home ground of RCB”");
            }
        }else{
            System.out.println("Don't enter NULL value...");
        }
    }

    public static void main(String[] args) {
        IPL game = new IPL();
        System.out.println("Enter Stadium Name : ");
        Scanner input = new Scanner(System.in);
        Stadium stadiumName = Stadium.valueOf(input.next().toUpperCase());
        game.homeTeamStadium(Stadium.stadiumName);
    }
}
