package ex7;

public interface Intr {
    void method1();
    default void method2(){
        System.out.println("default void method2()...");
    }
}
