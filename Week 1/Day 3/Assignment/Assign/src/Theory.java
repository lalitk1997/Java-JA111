public class Theory {
    // Class is a template for the Objects.
    // Class is virtual encapsulation of properties and behaviours.
    // Object is physical encapsulation of properties and behaviours.
    // Objects containing data (state) and operations on these data (methods).
    // Instance Variable : Variable which is created inside the class but outside the method.
    // Instance Variable is allocated memory at runtime when an object is created.
    int x = 10; // Instance Variable (Non-Static)
    static int z = 20; // Instance Variable (Static)
    // Static elements will be loaded into RAM first.
    // To load non-static elements of Class create Obj for that class.
    public static void main(String[] args) {
        int y = 10; // Local Variable
        System.out.println(y);
        // System.out.println(x);
        System.out.println(z);
        Theory obj = new Theory();
        System.out.println(obj.x);
        obj.x = 100; // Change will be done only inside RAM not HDD. DOUBT
        // In Java, a single object can be referenced by multiple reference
        // variables simultaneously, but at a time one reference variable can refer to
        // only one object. DOUBT Page 7 Day 3
        System.out.println(obj.x);
        System.out.println("-----------------");
        Theory obj1 = new Theory();
        System.out.println(obj1.x);
        System.out.println("------------------");
        Theory obj2 = obj1;
        System.out.println(obj2.x);
        obj2 = null; // Garbage collector will destroy obj2
        // System.out.println(obj2.x); // NullPointerException

    }
}
