package Que4;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("Enter Input file name : ");
        Scanner in = new Scanner(System.in);
        String inputFile = in.next();
        FileReader inputfile = new FileReader(inputFile);

        System.out.println("Enter Output file name : ");
        String outputFile = in.next();
        FileWriter outputfile = new FileWriter(outputFile);

        int chara = inputfile.read();
        while(chara != -1){
            outputfile.write(chara);
            // System.out.println("Entered "+(char)chara);
            chara = inputfile.read();
        }
        outputfile.flush();
        outputfile.close();

    }
}
