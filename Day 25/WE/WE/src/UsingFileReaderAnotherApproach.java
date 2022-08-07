import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class UsingFileReaderAnotherApproach {
    public static void main(String[] args) throws IOException {
        File f = new File("d://abc.txt");
        FileReader fr = new FileReader(f);

        // System.out.println(f.length()); // COMPLETE LENGTH OF FILE
        char[] ch = new char[(int)f.length()];
        fr.read(ch);
        System.out.println(ch);
    }
}
