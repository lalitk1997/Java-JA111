package Lock;

public class Counter implements Runnable{

    private int c = 0;

    public void increment(){
        try{
            Thread.sleep(10);
        }catch (Exception e){
            System.out.println(e);
        }
        c++;
    }

    public void decrement(){
        c--;
    }

    public int getValue(){
        return c;
    }

    @Override
    public void run() {
        synchronized (this){
            this.increment();
            System.out.println("Value "+Thread.currentThread().getName()+" "+this.getValue());
            this.decrement();
            System.out.println("Value "+Thread.currentThread().getName()+" "+this.getValue());
        }
    }
}
