import ThreadPriority.Main;

public class SleepMethod implements Runnable{
    @Override
    public void run() {
        for(int i=0; i<5; i++){
            System.out.println("Inside run() :"+i);
        }
        try{
            Thread.sleep(3000);
        }catch (Exception e){
            System.out.println(e);
        }
        System.out.println("End of run() ...");
    }

    public static void main(String[] args) {
        SleepMethod obj = new SleepMethod();
        Thread objThread = new Thread(obj);

        objThread.start();
        System.out.println("End of main...");
    }
}
