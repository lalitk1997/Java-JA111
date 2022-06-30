public class Main {
    int[] marks = {1, 2, 3};
    int[] arr = new int[10];

    public static void main(String[] args) {
        Main obj = new Main();
        System.out.println(obj.marks); // PRINTS ADDRESS
        System.out.println("--------");
        for(int i=0; i<obj.marks.length; i++){
            System.out.println(obj.marks[i]);
        }
        System.out.println("---------");
        for(int i=0; i<10; i++){
            obj.arr[i] = i;
        }
        for(int i=0; i<10; i++){
            System.out.println(obj.arr[i]);
        }
        System.out.println("---------");
        System.out.println(obj.arr);
        System.out.println("---------");
        for(int val: obj.marks){
            System.out.println(val);
        }
    }
}
