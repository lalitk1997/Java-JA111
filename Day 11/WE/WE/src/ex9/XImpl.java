package ex9;

public class XImpl implements X{
    @Override
    public void fun1() {
        System.out.println("public void fun1()... Method Overridden..");
    }

    @Override
    public void fun2() {
        System.out.println("public void fun2()... Method Overriden..");
    }
    // Specific Method
    public void fun3(){
        System.out.println("inside fun3 of XImpl");
    }
}
