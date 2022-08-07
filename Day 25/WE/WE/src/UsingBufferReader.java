import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.IOException;

public class UsingBufferReader {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("d://abc.txt");
        BufferedReader bfr = new BufferedReader(fr);
        String line = bfr.readLine();
        while (line != null){
            System.out.println(line);
            line = bfr.readLine();
        }
        bfr.close();
    }
}
