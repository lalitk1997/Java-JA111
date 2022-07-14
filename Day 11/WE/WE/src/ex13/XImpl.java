package ex13;

public class XImpl implements X, Y{
    @Override
    public void fun1() {
        System.out.println("fun1...");
    }

    @Override
    public void fun2() {
        System.out.println("fun2...");
    }

    @Override
    public void fun3() {
        System.out.println("fun3...");
    }

    @Override
    public void fun4() {
        System.out.println("fun4...");
    }

    public static void main(String[] args) {
        XImpl obj = new XImpl();
        obj.fun1();
        obj.fun2();
        obj.fun3();
        obj.fun4();
        X objX = (X)obj;
        // WHY CANNOT BE CALLED ?
        //objX.testFunc();
    }
}
