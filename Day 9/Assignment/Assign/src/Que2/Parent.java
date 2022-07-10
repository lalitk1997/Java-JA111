package Que2;

public abstract class Parent {
    final int number = 10;
    abstract void method1();
    final void method2(){
        System.out.println("Class Prent... final void method2()... ");
    }
    void method3(){
        System.out.println("Class Parent... void method3()... ");
    }
}
