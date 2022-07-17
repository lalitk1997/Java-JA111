package Que1;

public class Demo {
    public static void main(String[] args) {
        ZImpl obj = new ZImpl();
        obj.funcAbstractX();;
        obj.funcDefaultX();
        X.funcStaticX();
        System.out.println("-x-x-x-x-x-");
        obj.funcAbstractY();
        obj.funcDefaultY();
        Y.funcStaticY();
        System.out.println("-x-x-x-x-x-");
        obj.funcAbstractZ();
    }
}
