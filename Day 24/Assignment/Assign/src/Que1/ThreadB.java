package Que1;

public class ThreadB extends Thread{
    RaceCondition obj;

    ThreadB(RaceCondition obj){
        this.obj = obj;
    }

    @Override
    public void run() {
        obj.decrement();
    }
}
