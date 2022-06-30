public class Poly {
    void fun1(byte b){
        System.out.println("inside fun1 of Poly (byte)");
    }
    void fun1(int i){
        System.out.println("inside fun1 of Poly (int)");
    }

    public static void main(String[] args) {
        Poly p1 = new Poly();
        byte x = 20;
        p1.fun1(20); // DOUBT
    }
}
