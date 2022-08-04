package ClassLock;

public class ThreadA extends Thread{

    Common c;
    String name;

    ThreadA(Common c, String name){
        this.c = c;
        this.name = name;
    }

    @Override
    public void run() {
        c.fun1(name);
    }

}
