package MultipleThreadSimu;

public class ThreadB extends Thread{
    @Override
    public void run() {
        for (int i=50; i<60; i++){
            System.out.println("Inside class ThreadB:run() method "+i);
        }
        System.out.println("end of ThreadB");
    }
}
