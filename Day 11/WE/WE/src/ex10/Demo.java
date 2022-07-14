package ex10;

public class Demo {
    public X funDemo(){
        System.out.println("Inside public X funDemo() method...");
        return new XImpl();
    }

    public static void main(String[] args) {
        Demo d1 = new Demo();

        Object objO = d1.funDemo();
        // Down cast
        X objXX = (X)objO;
        objXX.fun1();
        objXX.fun2();
        // Down cast
        XImpl objI = (XImpl)objXX;
        objI.fun1();
        objI.fun2();
        objI.fun3();

        // Interface Ref ... Implemented Class Constructor
        X x1 = new XImpl();
        x1.fun1();
        x1.fun2();

        // Down casting from X Interface ref to Implemented Class ref
        XImpl objX = (XImpl) x1;
        objX.fun1();
        objX.fun2();
        objX.fun3();
    }
}
