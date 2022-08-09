package _1BufferReaderImpl;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class _1BufferReader {
    public static void main(String[] args) throws Exception {
        // WRITING
        FileWriter objfilewriter = new FileWriter("d://abc.txt");
        BufferedWriter objBufferedwriter = new BufferedWriter(objfilewriter);
        objBufferedwriter.write("Lalit Kumar");
        objBufferedwriter.newLine();
        objBufferedwriter.write("Rupesh Patil");
        objBufferedwriter.flush();
        objBufferedwriter.close();
        // READING
        FileReader objfilereader = new FileReader("d://abc.txt");
        BufferedReader objBufferedreader = new BufferedReader(objfilereader);
        String strName = objBufferedreader.readLine();
        while(strName != null){
            System.out.println(strName);
            strName = objBufferedreader.readLine();
        }
        objBufferedreader.close();
    }
}
