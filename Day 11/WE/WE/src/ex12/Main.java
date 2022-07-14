package ex12;

import ex9.Demo;

public class Main implements Intr3{
    @Override
    public void funA() {
        System.out.println("public void funA() Intr1...");
    }

    @Override
    public void funB() {
        System.out.println("public void funB() Intr1...");
    }

    @Override
    public void funC() {
        System.out.println("public void funC() Intr2...");
    }

    @Override
    public void funD() {
        System.out.println("public void funD() Intr2...");
    }

    @Override
    public void funE() {
        System.out.println("public void funE() Intr3...");
    }

    @Override
    public void funF() {
        System.out.println("public void funF() Intr3...");
    }

    public static void main(String[] args) {
        Main obj = new Main();
        obj.funA();
        obj.funB();
        obj.funC();
        obj.funD();
        obj.funE();

        Intr1 obj1 = new Main();
        obj1.funA();
        obj1.funB();

        Intr2 obj2 = new Main();
        obj2.funC();
        obj2.funD();

        Intr3 obj3 = new Main();
        obj3.funA();
        obj.funB();
        obj.funC();
        obj.funD();
        obj.funE();
    }
}
