package SyncKeyword;

public class Common {

    public void fun1(String name){
        System.out.println("Welcome ..... inside fun1(String name) ....");
        try{
            Thread.sleep(2000);
        } catch(Exception e){
            System.out.println("Exception : "+e);
        }
        System.out.println("Passed name : "+name);
    }
}
