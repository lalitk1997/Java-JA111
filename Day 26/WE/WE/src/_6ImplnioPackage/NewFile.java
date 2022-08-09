package _6ImplnioPackage;

//import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class NewFile {
    public static void main(String[] args) throws Exception{
        Path path = Paths.get("d://def.txt");
        if(Files.exists(path)){
            System.out.println("File already exists...");
        }else{
            Path path1 = Files.createFile(path);
            System.out.println("created a file at : "+path1);
        }
    }
}
