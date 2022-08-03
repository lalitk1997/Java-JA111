package MultipleThreadOnSingleObj;

import ThreadName.ThreadB;

public class RunThread implements Runnable{
    @Override
    public void run() {
        for(int i=0; i<10; i++){
            String tName = Thread.currentThread().getName();
            System.out.println(tName+" : "+i);
        }
    }

    public static void main(String[] args) {
        RunThread obj = new RunThread();

        Thread oneThread = new Thread(obj);
        Thread twoThread = new Thread(obj);

        oneThread.setName("One");
        twoThread.setName("Two");

        oneThread.start();
        twoThread.start();
    }
}
