import java.util.Scanner;


public class prcr9 {
	public static void main(String args[])
	{
		int sum = 0;
		int N;
		Scanner sc=new Scanner(System.in);
		N=sc.nextInt();
				for(int i = 1;i <= N;i++)
		{
			sum = sum + i;
		}
		System.out.println("The Sum Of "+N+" Numbers are:" + sum);
	}
}
