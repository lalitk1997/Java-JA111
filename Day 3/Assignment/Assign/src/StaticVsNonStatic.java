public class StaticVsNonStatic {
    static void fun1(){
        System.out.println("StaticVsNonStatic Class --> static fun1");
    }
    void fun2(){
        System.out.println("StaticVsNonStatic Class --> non-static fun2");
    }

    public static void main(String[] args) {
        StaticVsNonStatic obj = new StaticVsNonStatic();

        // Static Func can be accessed :
        // 1. Directly
        // 2. Via Object
        // 3. Via Class

        fun1();
        obj.fun1();
        StaticVsNonStatic.fun1();

        // Non-Static Func can be accessed via Obj only
        obj.fun2();
    }
}
