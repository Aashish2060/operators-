import java.util.*;
public class If_else {
    public static void main(String[] args)
    {
        int age=17;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 2 no:");
        int num1 =sc.nextInt();
        int num2= sc.nextInt();


        if(age>=18) {
            System.out.println("Adult :You can ride");
        }
        else
            System.out.println("You are not adult");
        if(num1>=num2){
            System.out.println(" A Largest no is"+num1);
        }
        else{
            System.out.println("The Largest no is"+num2);
        }
    }
}
