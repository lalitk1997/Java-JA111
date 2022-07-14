package ex9;

public class Demo {
    public void funDemo(X obj){
        if(obj != null) {
            System.out.println("Inside funDemo func...");
            obj.fun1();
            obj.fun2();
        }else{
            System.out.println("Don't pass null value");
        }
    }

    public static void main(String[] args) {
        Demo d1 = new Demo();
        // Implemented Class Obj
        XImpl obj = new XImpl();
        d1.funDemo(obj);
        // Interface Reference --- Implemented Class Obj
        X objX = new XImpl();
        d1.funDemo(objX);
    }
}
