package Throws;

import java.io.IOException;

public class Main1 {
    void method() throws IOException{
        throw new IOException("Device Error...");
    }

    public static void main(String[] args) {
        /*
        Main1 obj = new Main1();
        obj.method();
         */
        try{
            Main1 m = new Main1();
            m.method();
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
