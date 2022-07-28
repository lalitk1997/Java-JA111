package FuncInterface2;

@FunctionalInterface
interface Intr{
    // ABSTRACT METHOD
    void sayHello();

    // DOUBT
    // OBJECT CLASS METHOD
    // boolean equals(Object obj);

    default void fun1(){
        System.out.println("inside the default method fun1 of Intr");
    }

    static void fun2(){
        System.out.println("inside the static method fun2 of Intr");
    }
}