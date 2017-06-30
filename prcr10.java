import java.util.Scanner;


public class prcr10 {
	public static void main(String []agrs){
    int count=0;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number:");
    int a=sc.nextInt();
	while(a>0){
		a=a/10;
		count=count+1;
		}
	System.out.println(count);

    }
}