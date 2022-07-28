package FuncInterface;

@FunctionalInterface
public interface Intr {
    void sayHello();

    static void staticHello(){
        System.out.println("HELLO FROM THE STATIC METHOD...");
    }

    default  void defaultHello(){
        System.out.println("HELLO FROM THE DEFAULT METHOD...");
    }
}
