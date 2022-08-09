package _3Serialization;

import java.io.*;

public class SerializableImpl implements Serializable {
    int i = 10;
    public void funA(){
        System.out.println("Inside funA() method ...");
        System.out.println(i);
    }
}

class Main{
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        SerializableImpl objSerial = new SerializableImpl();
        objSerial.funA();
        // SERIALIZATION
        FileOutputStream fileIOStream = new FileOutputStream("d://abc.txt");
        ObjectOutputStream objOPStream = new ObjectOutputStream(fileIOStream);
        objOPStream.writeObject(objSerial);
        objOPStream.flush();
        objOPStream.close();
        System.out.println("Object Serialized ...");
        // DESERIALIZATION
        FileInputStream fileInputStream = new FileInputStream("d://abc.txt");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        Object obj = objectInputStream.readObject();
        SerializableImpl objSerial2 = (SerializableImpl) obj;
        objSerial2.funA();
        System.out.println(objSerial2.i);
    }
}
