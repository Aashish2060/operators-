import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 3 no you want ot compare:");
        int a= sc.nextInt();
        int b= sc.nextInt();
        int c= sc.nextInt();
        System.out.println("Enter the marks");
        int marks = sc.nextInt();

        if((a>=b)&&(a >= c)) {
            System.out.println("A is greatest ie :"+a);
        } else if (b>=c) {
            System.out.println("B is greatest ie "+b);

        }
        else
        {
            System.out.println("C is greatest ie: "+c);
        }

        // Using ternary operator
        // True false
        //boolean Larger= ((a%2==0)&&(b%2==0)&&(c%2==0))?"Even":"Odd";

         String report = marks>=35?"Passed ":"Fail";
        System.out.println(report);
    }
}