package Que3;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter location of file : ");
        String fileName = in.next();
        System.out.println("Enter character : ");
        char alpha = in.next().charAt(0);
        alpha = Character.toLowerCase(alpha);
        int count = 0;
        try{
            FileReader fr = new FileReader(fileName);
            int nextChara = fr.read();
            while(nextChara != -1){
                if(Character.toLowerCase((char)nextChara) == alpha){
                    count += 1;
                }
                nextChara = fr.read();
            }
            System.out.println(alpha+" appeared "+count+" times");
        }catch (IOException e){
            System.out.println("File doesn't exists...");
        }

    }
}
