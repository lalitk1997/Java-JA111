package ex6;

public class Main {
    public static void getNoise(Animal animal){
        animal.makeNoise();
    }
    public static void main(String[] args) {
        Main.getNoise(new Dog());
        Main.getNoise(new Cat());
    }
}
