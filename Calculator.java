import java.util.*;
public class Calculator {
    public static void main(String[] args)
    {
        System.out.println("Enter the no a:");
        Scanner sc=new Scanner(System.in);
        int a= sc.nextInt();
        System.out.println("Enter the no b:");
        int b= sc.nextInt();
        System.out.println("Choose the operation(+,-,/,*,%):");
        char operator=sc.next().charAt(0);


        switch (operator)
        {
            case '+' : System.out.println(a+b);
            break;
            case '2' : System.out.println(a-b);
                break;
            case '/' : System.out.println(a/b);
                break;
            case '*': System.out.println(a*b);
                break;
            case '%' : System.out.println(a%b);
                break;
            default:System.out.println("Error Detected.");
        }
    }
}
