package Que2;

public class Common {
//    public synchronized void fun1(String name){
    public void fun1(String name){
         synchronized (this){
             System.out.println("Entry --> Thread Name : "+Thread.currentThread().getName());
            try{
                Thread.sleep(5000);
            }catch (Exception e){
                System.out.println(e);
            }
             System.out.println("Exit --> Thread Name : "+Thread.currentThread().getName());
         }
    }

}
