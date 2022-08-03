package MultipleThreadSimu;

public class ThreadC extends Thread{
    @Override
    public void run() {
        for (int i=20; i<30; i++){
            System.out.println("Inside class ThreadC:run() method "+i);
        }
        System.out.println("end of ThreadC");
    }
}
