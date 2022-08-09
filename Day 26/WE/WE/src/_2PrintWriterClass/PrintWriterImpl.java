package _2PrintWriterClass;

import java.io.*;

public class PrintWriterImpl {
    public static void main(String[] args) throws Exception {
        // WRITER
        FileWriter objFileWriter = new FileWriter("d://abc.txt");
        PrintWriter objPrintWriter = new PrintWriter(objFileWriter);
        objPrintWriter.write(100); //d
        objPrintWriter.print(100); //100
        objPrintWriter.print(true); //true
        objPrintWriter.write("true"); //true
        objPrintWriter.print("amit"); //amit
        objPrintWriter.println("renuka"); //renuka
        objPrintWriter.println("lalit"); // lalit
        objPrintWriter.flush();
        objPrintWriter.close();
        // READER
        FileReader objFileReader = new FileReader("d://abc.txt");
        BufferedReader objBufferedReader = new BufferedReader(objFileReader);
        String data = objBufferedReader.readLine();
        while(data != null){
            System.out.println(data);
            data = objBufferedReader.readLine();
        }
        objBufferedReader.close();
    }
}
