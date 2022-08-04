package Que2;

public class Main {
    public static void main(String[] args) {
        Common objC = new Common();
        ThreadA objA = new ThreadA(objC, "Lalit");
        ThreadB objB = new ThreadB(objC, "Kumar");
        objA.setName("One - 1");
        objB.setName("Two - 2");
        objA.start();
        objB.start();
    }
}
