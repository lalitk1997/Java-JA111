package Que1;

import java.util.Arrays;

public  class RaceCondition {
    private static int count = 0;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }


    public synchronized void decrement(){
        synchronized (RaceCondition.class){
            System.out.println("Inside RaceCondition Class... decrement() method..."+Thread.currentThread().getName()+" "+count);
            RaceCondition.count -= 1;
            try{
                Thread.sleep(3000);
            }catch (Exception e){
                System.out.println(Arrays.toString(e.getStackTrace()));
            }
            System.out.println("End RaceCondition Class... decrement() method... "+Thread.currentThread().getName()+" "+count);
        }
    }
}
