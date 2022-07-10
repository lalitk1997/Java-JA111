package Que1;

public class HistoryStudent extends Student<Integer>{
    int historyMarks;
    int civicsMarks;
    int geographyMarks;

    HistoryStudent(String name, String address, int historyMarks, int civicsMarks, int geographyMarks) {
        super(name, address);
        this.historyMarks = historyMarks;
        this.civicsMarks = civicsMarks;
        this.geographyMarks = geographyMarks;
    }

    @Override
    public String toString() {
        return "HistoryStudent{" +
                "historyMarks=" + historyMarks +
                ", civicsMarks=" + civicsMarks +
                ", geographyMarks=" + geographyMarks +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    @Override
    double getPercentage(Integer... params) {
        return (((historyMarks+civicsMarks+geographyMarks) / 300.0) * 100);
    }
}
