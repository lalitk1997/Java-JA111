package _4Transient;

import java.io.*;

public class Student implements Serializable {
    int id;
    String name;
    transient int age;

    public Student(int id, String name, int age){
        this.id = id;
        this.name = name;
        this.age = age;
    }

}

class Main{
    public static void main(String[] args) throws Exception {
        Student s1 = new Student(111, "Lalit Kumar", 35);
        //OBJECT TO STREAM
        FileOutputStream objectFileOutputStream = new FileOutputStream("d://abc.txt");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(objectFileOutputStream);
        objectOutputStream.writeObject(s1);
        objectOutputStream.flush();
        objectOutputStream.close();
        System.out.println("Success ...");
        // STREAM TO OBJECT
        FileInputStream objectFileInputStream = new FileInputStream("d://abc.txt");
        ObjectInputStream objectInputStream = new ObjectInputStream(objectFileInputStream);
        Object stuObj = objectInputStream.readObject();
        Student stuObjCon = (Student) stuObj;
        System.out.println(stuObjCon.name+" id : "+stuObjCon.id+" age : "+stuObjCon.age);
        System.out.println("Success ...");
    }
}
