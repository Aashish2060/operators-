import java.util.*;
public class Tax_calculatr {
    public static void main(String[] agrs) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Income:");
        int income = sc.nextInt();
        int tax;
        
        if(income<500000)
        {
            tax=0;
        } else if (income>=500000 &&income<1000000) {
            tax=(int)(income*0.2);
            
        }
        else {
            tax= (int) (income*0.3);
        }
System.out.println("The total tax is:"+tax);
    }
}
