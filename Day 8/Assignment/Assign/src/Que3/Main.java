package Que3;

public class Main {
    public static void main(String[] args) {
        Animal[] a1 = new Animal[3];
         a1[0] = new Dog();
         a1[1] = new Cat();
         a1[2] = new Tiger();
         a1[0].eat();
         a1[0].walk();
         a1[0].makeNoise();
         a1[1].eat();
         a1[1].walk();
         a1[1].makeNoise();
         a1[2].eat();
         a1[2].walk();
         a1[2].makeNoise();
    }
}
