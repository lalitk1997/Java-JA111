package FileIO;

import java.io.File;
import java.io.IOException;

public class Ex1 {
    public static void main(String[] args) throws IOException {
        File f = new File("abc.txt");
        System.out.println(f); // Just Prints the location passed.
        // File is present or not.
        System.out.println(f.exists());
        // Creating the file.
        f.createNewFile();
        System.out.println(f.exists());
        System.out.println(f);

        File f2 = new File("d://abc.txt");
        f2.createNewFile();
        System.out.println(f2.exists());
        System.out.println(f);

        File f3 = new File("d://temp");
        System.out.println(f3.exists());
        f3.mkdir();
        System.out.println(f3.exists());
        System.out.println(f3);

        File f4 = new File("d://temp/abc.txt");
        System.out.println(f4.exists());
        f4.createNewFile();
        System.out.println(f4.exists());
        System.out.println(f4);

    }
}
