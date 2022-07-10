package Que1;

public class ScienceStudent extends Student<Integer>{
    int physicsMarks;
    int chemistryMarks;
    int mathMarks;

    ScienceStudent(String name, String address, int physicsMarks, int chemistryMarks, int mathMarks) {
        super(name, address);
        this.physicsMarks = physicsMarks;
        this.chemistryMarks = chemistryMarks;
        this.mathMarks = mathMarks;
    }

    @Override
    double getPercentage(Integer... params) {
        return (((physicsMarks+chemistryMarks+mathMarks) / 300.0) * 100);
    }

    @Override
    public String toString() {
        return "ScienceStudent{" +
                "physicsMarks=" + physicsMarks +
                ", chemistryMarks=" + chemistryMarks +
                ", mathMarks=" + mathMarks +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
