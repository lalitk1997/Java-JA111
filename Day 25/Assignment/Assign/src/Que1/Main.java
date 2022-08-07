package Que1;

import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        FileReader fileObj = new FileReader("d://abc.txt");
        int num = fileObj.read();
        // System.out.println((char)num);
        while (num != -1){
            System.out.println((char)num);
            num = fileObj.read();
        }
    }
}
