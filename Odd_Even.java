import java .util.*;
public class Odd_Even {
    public static void main(String[] args)
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the no:");
      int num= sc.nextInt();


      if(num%2==0)
        {
          System.out.println("The no is a even no.");
        }

       else {
          System.out.println("The no is odd no.");
      }
    }
}
