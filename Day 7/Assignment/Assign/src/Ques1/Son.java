package Ques1;
// Child Class
public class Son extends Dad{
    @Override
    void drinks(){
        // Call Dad class drinks method
        super.drinks();
        System.out.println("Son like to drink milk.");
    }

    public static void main(String[] args) {
        Dad d = new Son();
        d.drinks();
    }
}
