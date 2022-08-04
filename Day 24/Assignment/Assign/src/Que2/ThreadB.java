package Que2;

public class ThreadB extends Thread{
    Common c;
    String name;

    ThreadB(Common c, String name){
        this.c = c;
        this.name = name;
    }

    @Override
    public void run() {
        c.fun1(name);
    }
}
