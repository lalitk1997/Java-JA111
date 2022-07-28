package GenericClass;

public class Main {
    public static void main(String[] args) {
        // USING GENERIC CLASS
        System.out.println(" TYPE : STRING ");
        GenericClass<String> obj = new GenericClass<String>();
        obj.add("Lalit Kumar");
        System.out.println(obj.get());

        System.out.println(" TYPE : INTEGER");
        GenericClass<Integer> obj2 = new GenericClass<Integer>();
        obj2.add(20);
        System.out.println(obj2.get());

        System.out.println("TYPE : STUDENT CLASS");
        GenericClass<Student> obj3 = new GenericClass<Student>();
        obj3.add(new Student(10, "Lalit Kumar", 200));
        System.out.println(obj3.get().roll+" "+obj3.get().name+" "+obj3.get().marks);

    }
}
