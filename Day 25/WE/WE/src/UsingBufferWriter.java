import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class UsingBufferWriter {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("d://abc.txt");
        BufferedWriter fb = new BufferedWriter(fw);
        fb.write("Lalit Kumar");
        fb.newLine();
        fb.write("Hey guyzz!!! Hoe are you all?");
        fb.newLine();
        fb.write("I am really amazing....");
        fb.newLine();
        fb.write(new char[]{97, 98, 99, 100});
        fb.flush();
        fb.close();
    }
}
