package Que3;

public class ThreadOdd extends Thread{
    @Override
    public void run() {
        System.out.println("Start ThreadOdd run() ....");
        for (int i=0; i<=20; i++){
            if(i % 2 == 1){
                System.out.println(Thread.currentThread().getName()+" "+i);
            }
        }
        System.out.println("End ThreadEven run() ....");
    }
}
