import java.util.Scanner;


public class prcr5 {
	public static void main(String []args){
	      System.out.println("Enter the number:");
      Scanner sc=new Scanner(System.in);
      int a=sc.nextInt();
      int b=sc.nextInt();
      int c=sc.nextInt();
        if(a>b){
        	System.out.println("Largest number is a");
        }
        else if(b>c){
        	System.out.println("Largest number is b");
        }
        else{
        	System.out.println("Largest number is c");
        }
	}

}
