package _5ObjectGraph;

import java.io.*;

class Animal implements Serializable {
    int countAnimal = 10;
}

class Dog extends Animal{
    int countDog = 5;
}

class Main{
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        FileOutputStream fileOutputStream = new FileOutputStream("d://abc.txt");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(new Dog());

        FileInputStream fileInputStream = new FileInputStream("d://abc.txt");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        Object objDog = objectInputStream.readObject();
        Dog objDogConverted = (Dog) objDog;
        System.out.println(objDogConverted.countDog);
    }
}
