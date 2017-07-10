import java.util.Scanner;

public class beginnerl3 {
public static void main(String args[]) {
	@SuppressWarnings("unused")
	int a;
	@SuppressWarnings("resource")
	Scanner in=new Scanner(System.in);
	a=in.nextInt();
	if((a%a)==0 || (a%1)==0) {
		System.out.println("prime number");
	}
	else {
	System.out.println("not prime number");}
}
}
