package Que1;

public class ThreadA extends Thread{
    RaceCondition obj;

    ThreadA(RaceCondition obj){
        this.obj = obj;
    }

    @Override
    public void run() {
        obj.decrement();
    }
}
