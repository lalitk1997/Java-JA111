public class JavaSwitchCase {
    static void printCity (String city){
        switch (city){
            case "Mumbai":
                System.out.println("Financial City");
                break;
            case "Kolkata":
                System.out.println("City of Joy");
                break;
            case "Delhi":
                System.out.println("Capital of Country");
                break;
            case "Bangalore":
                System.out.println("Cyber City");
                break;
            default:
                System.out.println("May be Other Indian City");
        }
    }

    public static void main(String[] args) {
        printCity("Delhi");
        printCity("Kolkata");
        printCity("Punjab");
    }
}
