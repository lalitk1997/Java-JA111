package ClassLock;

public class Common {

//    Common c;
//    String name;
//
//    Common(Common c, String name){
//        this.c = c;
//        this.name = name;
//    }

    public static synchronized void fun1(String name){
        System.out.println("Welcome to Common class ... void fun1() method ...");
        try{
            Thread.sleep(2000);
        }catch (Exception e){
            System.out.println(e.getStackTrace());
        }
        System.out.println("End of void fun1().... "+name);
    }

}
