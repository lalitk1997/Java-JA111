package ex6;

public class Test {
    enum Color{
        ORANGE, YELLOW, PINK;
    }
    public static void main(String args[]){
        Color arr[] = Color.values();
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i] +" ");
        }
        for(Color str: arr){
            System.out.println(str.ordinal());
        }
    }
}
