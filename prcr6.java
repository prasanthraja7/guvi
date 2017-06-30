import java.util.Scanner;


public class prcr6 {
public static void main(String []args){
	double a;
    System.out.println("Enter the year:");
          Scanner sc=new Scanner(System.in);
          a=sc.nextDouble();
            if(a%4==0){
            	System.out.println("Leap year");
            }
            else{
            	System.out.println("Not Leap year");
            }
    	}
}

