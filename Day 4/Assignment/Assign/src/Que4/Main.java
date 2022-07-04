package Que4;

public class Main {
    public void multipleOfTen(int val){
        if(val < 0){
            System.out.println("Error !");
        }else{
            if(val % 10 == 0){
                System.out.println(val);
            }else{
                int temp = 10 - (val % 10);
                System.out.println(val+temp);
            }
        }
    }
    public static void main(String[] args) {
        Main m = new Main();
        m.multipleOfTen(11);
    }
}
