package Que2;

import java.util.Scanner;

final class Child extends Parent{
    Child(int num) {
        super(num);
    }
    @Override
    void method1() {
        System.out.println("Child Class... method1... ");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number b/w 1-10");
        int ip = input.nextInt();
        if(ip < 1 || ip > 10){
            System.out.println("Invalid Number");
        }else{
            new Child(ip);
            System.out.println("Number is : "+number);
        }
    }
    void method4(){
        System.out.println("Child Class... method4... ");
    }
//    public static void main(String[] args) {
//        Parent p1 = new Child();
//        p1.method1();
//        p1.method2();
//        // p1.method3();
//        Child c1 = (Child)p1;
//        c1.method4();
//    }
}
