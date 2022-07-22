package Throws;

import java.io.IOException;

public class Main {
    // METHOD : 1
    void m() throws IOException{
        throw new IOException("Device Error...");
    }
    // METHOD : 2
    void n() throws IOException{
        m();
    }
    // METHOD : 3
    void p(){
        try{
            n();
        }catch (IOException e){
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        Main obj = new Main();
        obj.p();
        System.out.println("Normal Flow ....");
    }
}
