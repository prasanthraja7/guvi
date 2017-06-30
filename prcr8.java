import java.util.Scanner;


public class prcr8 {
    public static void main(String args[])
    {
        int p, n = 1 ;
        int sum = 0;
        System.out.println("Enter Number:");
        Scanner s = new Scanner(System.in);
        p= s.nextInt();
        while(n <= p)
        {
            sum = sum +n;
            n++;
        }
        System.out.println("Sum of "+p+" numbers is :"+sum);
    } 

}
