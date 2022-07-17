package Que1;

public interface X {
    abstract void funcAbstractX();
    default void funcDefaultX(){
        System.out.println("default void funcDefaultX()... interface X...");
    }
    static void funcStaticX(){
        System.out.println("static void funcStaticX()... interface X...");
    }
}
