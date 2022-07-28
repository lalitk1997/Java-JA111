package GenericClass;

public class GenericClass<T> {
    public T obj;
    // SET THE VALUE OF OBJ OF TYPE T
    public void add(T obj){
        this.obj = obj;
    }
    // RETURN THE VALUE STORED IN OBJ OF TYPE T
    public T get(){
        return this.obj;
    }
}
