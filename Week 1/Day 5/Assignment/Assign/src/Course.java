import java.util.Scanner;

public class Course {
    int courseId;
    String courseName;
    int courseFee;
    void displayCourseDetails(){
        System.out.println("CourseId : "+courseId);
        System.out.println("CourseName : "+courseName);
        System.out.println("CourseFee : "+courseFee);
    }
    static void authenticate(String username, String password){
        if(username.equals("Admin")  && password.equals("1234")){
            Course c1 = new Course();
            Scanner input = new Scanner(System.in);
            System.out.println("Enter CourseId");
            c1.courseId = input.nextInt();
            System.out.println("Enter CourseName");
            c1.courseName = input.next();
            System.out.println("Enter CourseFee");
            c1.courseFee = input.nextInt();
        }else{
            System.out.println("Invalid username or password");
        }
    }

    public static void main(String[] args) {
        authenticate("Admin", "1234");
        System.out.println("------------------------");
        authenticate("Admin", "123");
    }
}
