package Que4;
/*
Instance of operator :
It is used to check whether a given obj is an instance of a particular class.
Child class obj are instance of parent class.
It can be used to avoid ClassCast Exception.
 */

public class Main extends Parent{
    public static void main(String[] args) {
        Main obj = new Main();
        if(obj instanceof Parent){
            System.out.println("obj (Child class obj) is instance of Parent (Parent class)");
        }else{
            System.out.println("False");
        }
    }
}
