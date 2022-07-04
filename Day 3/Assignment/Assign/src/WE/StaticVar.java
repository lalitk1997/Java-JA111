package WE;

public class StaticVar {
    static int i = 10;
    public static void func1(){
        System.out.println("Inside Func1");
    }
    public static void main(String[] args) {
        // using directly
        System.out.println(i);
        func1();

        // using class
        System.out.println(StaticVar.i);
        StaticVar.func1();

        // using by obj
        StaticVar obj = new StaticVar();
        System.out.println(obj.i);
        obj.func1();
    }
}
