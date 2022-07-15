package ex2;

public class Main2 {
    static void display(int num, String... values){
        System.out.println("Value of num : "+num);
        for(String str:values){
            System.out.println(str);
        }
        System.out.println("============");
    }

    public static void main(String[] args) {
        display(200);
        display(500, "My", "name", "is", "Lalit", "Kumar");
    }
}
