package Que3;

public class ThreadEven extends Thread{
    @Override
    public void run() {
        System.out.println("Start ThreadEven run() ....");
        for(int i=0; i<=20; i++){
            if(i % 2 == 0){
                System.out.println(Thread.currentThread().getName()+" "+i);
            }
        }
        System.out.println("End ThreadEven run() ....");
    }
}
