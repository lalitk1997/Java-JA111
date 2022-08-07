import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class UsingFileWriter {
    public static void main(String[] args) throws IOException {
        File file = new File("d://abc.txt");
        System.out.println(file.exists());

        // WILL CREATE NEW FILE IF DOES NOT EXISTS
        FileWriter fw = new FileWriter("d://abc.txt");
        System.out.println(fw);
        fw.write(100);
        fw.write("\n");
        fw.write("Lalit Kumar");
        fw.write("\n");
        fw.write("Hey !! Guyz \n How are you all ?");

        fw.flush();
        fw.close();
        System.out.println("File is written...");

    }
}
