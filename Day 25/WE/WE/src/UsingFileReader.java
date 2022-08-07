import java.io.FileReader;

public class UsingFileReader {
    public static void main(String[] args) throws Exception {
        FileReader fr = new FileReader("d://abc.txt");
        int i = fr.read();

        while(i != -1){
            System.out.println((char) i);
            i = fr.read(); // ATTEMPTS TO READ THE NEXT CHARACTER AND RETURN THE VALUE
        }
    }
}
