package Que3;

public class Main implements Runnable{
    @Override
    public void run() {
        for (int i=1; i<=10; i++){
            if(i != 6){
                System.out.println(i);
            }else{
                try {
                    Thread.sleep(6000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        Main obj = new Main();
        Thread thread = new Thread(obj);
        thread.start();
    }
}
