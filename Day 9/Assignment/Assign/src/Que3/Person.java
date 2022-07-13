package Que3;

public class Person {
    String name;
    String gender;
    Address  a=new Address();

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", a=" + a +
                '}';
    }
}
