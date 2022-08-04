package Que1;

public class Main {
    public static void main(String[] args) {
        ThreadA objA = new ThreadA(new RaceCondition());
        ThreadA objB = new ThreadA(new RaceCondition());

        objA.setName("A");
        objB.setName("B");

        objA.start();
        objB.start();
    }
}
