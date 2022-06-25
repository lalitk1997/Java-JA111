public class WE {
    // Comments
    // Single-line Comments
    /*
     Multi-Line Comments
     */

    // Identifiers : Variable, Methods, Classes names.
    // Literals : Constant value assigned to a variable.
    static int age = 20;
    public static void main(String args[]){
        // Different Literals
        int var = 30;
        float pi = 3.14f;
        boolean isTrue = false;
        char alpha = 'A';
        String str = "Learning Java";
        double db = 3.14;
        System.out.println(age);
        System.out.println(var);
        System.out.println(pi);
        System.out.println(isTrue);
        System.out.println(alpha);
        System.out.println(str);
        System.out.println(db);
        // Operators
        // ex: 1
        int val = 10;
        System.out.println(val); // 10
        System.out.println(val++); // 10 -> 11
        System.out.println(++val); // 12 -> 12
        System.out.println(val--); // 12 -> 11
        System.out.println(--val); // 10 -> 10
        System.out.println(val); // 10
        // ex: 2
        int num = 10;
        System.out.println(++num - ++num); // 11 - 12 = -1
        // ex: 3
        int n = 5;
        System.out.println((--n+--n)*(++n-n--)+(--n+n--)*(++n+n++)); // (4 + 3)*(4 - 4)+(2 + 2)*(2 + 2) = 16
        System.out.println(n); // 3
        // Boolean Operator
        // ex: 4
        boolean b1 = true;
        boolean b2 = false;
        System.out.println(b1&b2);// false
        System.out.println(b1|b2);// true
        System.out.println(b1^b2);// true (a' b + a b') -> (false.false + true.true)
        // ex: 5
        int x = 10;
        int y = 2;
        System.out.println(x&y); // 1010 & 0010 -> 1000 (8)
        System.out.println(x|y); // 1010 -> (10)
        System.out.println(x^y); // 1000 -> (8)
        System.out.println(x>>2); // 1010 -> 0101 -> 0010 (2)
        // Short-Circuit Operators && ||
        // | & executes both times
        int tim = 10;
        int tom = 10;
        if((tim++ == 10) || (tom++ == 10)){
            System.out.println(tim+" "+tom); // 11 10 IF ONE IS TRUE IT WILL NOT CHECK OTHER CONDITION
        }
        // Data-Type :
        // integers: Byte, Short, Int, Long
        // real-numbers: Float Double
        short value = 10;
        System.out.println(value);
        // Wrapper Class : Classes Representation of Primitive Data-Type are Wrapper Class.
        System.out.println(Short.MIN_VALUE+" "+Short.MAX_VALUE);
        System.out.println(Double.MIN_VALUE+" "+Double.MAX_VALUE);
        // Type-Casting
        // Implicit Type-Casting: Automatically
        int val2 = 10;
        long val3 = val2;
        System.out.println(val3);
        // Explicit Type-Casting: Manually
        long val4 = 10;
        int val5 = (int)val4;
        System.out.println(val5);
        byte val6 = 65;
        char val7 = (char)val6;
        System.out.println(val7);
        byte val8 = 60;
        byte val9 = 68;
        byte val10 = (byte)(val8+val9);
        System.out.println(val10);
        // Java Statements
        // Conditionals Statements
        // Day 2 : Page 16
        // Doubt
        int val11 = 10;
        int val12;
        if(val11 == 10){
            val12 = 20;
        }else{
            val12 = 30; //Doubt
        }
        System.out.println(val12);
        // Switch Case
        int val13 = 10;
        switch(val13){
            case 1:
                System.out.println(1);
                break;
            case 10:
                System.out.println(10);
                break;
            case 5:
                System.out.println(5);
                break;
            default:
                System.out.println("Default");
                break;
        }
        // Iterative Statements
        for(int i=0; i<10; i++) {
            System.out.println(i);
        }
        System.out.println("----------");
        // System.out.println("Before");
        // for(int i=0; true; i++){
        //     System.out.println("Inside Loop"); // Infinite Loop
        // }
        // System.out.println("After"); // Due to Infinite Loop Statement Un-reachable
        System.out.println("-----------");
        // do-While loop
        int val14 = 0;
        do{
            System.out.println(val14);
            val14++;
        }while(val14<10);
        // break, continue & return
        for(int i=0; i<10; i++){
            if(i==5){
                System.out.println("Inside IF Condition");
                continue;
                // System.out.println("After continue"); // Un-reachable Statement
            }else{
                System.out.println(i);
            }
        }
    }
}
