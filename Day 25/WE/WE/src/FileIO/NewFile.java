package FileIO;

import java.io.File;

public class NewFile {
    public static void main(String[] args) {
        try{
            File file = new File("abcd.txt");
            if(!file.exists()) {
                file.createNewFile();
                System.out.println("New file created. ");
            }else
                System.out.println("File already exists.");
        }catch (Exception e){
            System.out.println("Exception "+e);
        }
    }
}
