package Throws;

import java.io.IOException;

public class Main2 {
    public void throwException() throws IOException{
        throw new IOException();
    }

    public static void main(String[] args) throws IOException {
        Main2 obj = new Main2();
        obj.throwException();

        System.out.println("Normal Flow...");
    }
}
