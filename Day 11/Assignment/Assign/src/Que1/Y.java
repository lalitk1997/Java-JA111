package Que1;

public interface Y {
    abstract void funcAbstractY();
    default void funcDefaultY(){
        System.out.println("default void funcDefaultY()... interface Y...");
    }
    static void funcStaticY(){
        System.out.println("static void funcStaticY()... interface Y...");
    }
}
