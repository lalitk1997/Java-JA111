package Throw;

public class Main3 {
    // METHOD : 1
    void m(){
        int data = 50 / 0;
    }
    // METHOD : 2
    void n(){
        m();
    }
    // METHOD : 3
    void p(){
        try{
            n();
        }catch(Exception e){
            System.out.println("exception handled");
        }
    }

    public static void main(String[] args) {
        Main3 obj = new Main3();
        obj.p();
    }
}
