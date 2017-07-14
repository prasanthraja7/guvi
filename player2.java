import java.util.Scanner;

public class player2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int b=1,i=1;
		@SuppressWarnings("resource")
		Scanner in  =new Scanner(System.in);
		System.out.println("Enter the number:");
        int a=in.nextInt();
         while(i<=a) {
        	b=b*i;
        	i++;
        }
        System.out.println("Factorial:"+b);
	}
}
