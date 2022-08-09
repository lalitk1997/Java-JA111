package _2PrintWriterClass;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class CopyImageIOStream {
    public static void main(String[] args) throws Exception {
        FileInputStream objfileInput = new FileInputStream("d://img.jpg");
        FileOutputStream objfileOutput = new FileOutputStream("e://img.jpg");

        int i = objfileInput.read();
        while (i != -1){
            objfileOutput.write(i);
            i = objfileInput.read();
        }

        objfileOutput.flush();
        objfileInput.close();
        objfileOutput.close();

    }
}
