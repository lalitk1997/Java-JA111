package _HashMapConstructor;
import java.util.Comparator;

public class MaxMarks implements Comparator<Student> // DOUBT WHY GENERIC NECESSARY
{
    @Override
    public int compare(Student o1, Student o2) {
        if(o1.getMark() > o2.getMark()){
            return 1;
        }else if(o1.getMark() < o2.getMark()){
            return -1;
        }else{
            return 0;
        }
    }
}
