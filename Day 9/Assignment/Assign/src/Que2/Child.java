package Que2;

import java.util.Scanner;

final class Child extends Parent{
    @Override
    void method1() {
        System.out.println("Child Class... void method1()... ");
    }
    void method4(){
        System.out.println("Child Class... void method4()... ");
    }
    public static void main(String[] args) {
        Child c1 = new Child();
        // DOUBT
        // c1.number = 100;
        Parent p1 = new Child();
        p1.method1();
        p1.method2();
        p1.method3();
        // DOUBT
        // p1.method4();
    }
}
