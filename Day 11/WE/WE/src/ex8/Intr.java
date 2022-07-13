package ex8;

public interface Intr {
    void method1();
    default void method2(){
        System.out.println("Inside default void method2()");
    }
    static void method3(){
        System.out.println("Inside static void method3()");
    }
}
