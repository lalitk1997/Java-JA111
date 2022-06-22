// Q1 Write the difference between JRE, JDK and JVM?
// Ans JRE stands for Java Runtime Environment : JRE is responsible for execution of JAVA code, combines
// required libraries and resources, and enables JVM for JAVA code execution.
// JDK stands for Java Development Kit : JDE is combination of multiple tools (like debugger, compiler etc) for
// JAVA Application development and testing.
// JVM stands for Java Virtual Machine : JVM is responsible for executing .class (object code) on to any platform
// which has JVM installed.

// Q2 Write the difference between JSE, JEE and JME?
// Ans JSE stands for Java Standard Edition : JSE development platform comprises core-Java functionality
// for application development.
// JEE stands for Java Enterprise Edition : JEE development platform provides tools for development of
// Enterprise-level software.
// JME stands for Java Micro Edition : JME development platform provides tools for development of micro
// applications used in (setup-boxes, mobiles, remotes, microwave, washing-machine etc.)

// Q3 How does java achieve platform independency?
// Ans Java achieve platform independency via JVM. As Java code (.java) is converted to byte code (.class)
// which can run on any platform (JVM must be available on that platform).

// Q4 What are features of Java and explain them?
// Ans  1. Simple (Belong to programming languages of C family)
// 2. Object Oriented
// 3. Platform Independent
// 4. Multi-Threading
// 5. Distributed

// Q5 Write a Java Application which prints your details?
public class Application {
    public static void main(String[] args) {
        System.out.println("Name : "+"Lalit Kumar");
        System.out.println("Father's Name : "+"Pratap Singh");
        System.out.println("Mother's Name : "+"Rohini Devi");
        System.out.println("Age : "+"25");
        System.out.println("Gender :"+"Male");
        System.out.println("Address : "+"Gurgaon");
        System.out.println("Mobile No. :"+"8076122040");
    }
}