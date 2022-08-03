package ThreadName;

public class ThreadA implements Runnable{
    @Override
    public void run() {
        for (int i=0; i<10; i++){
            String tName = Thread.currentThread().getName();
            System.out.println(tName+" running...");
        }
    }
}
