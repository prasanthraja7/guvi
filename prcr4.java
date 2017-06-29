import java.util.Scanner;


public class prcr4 {
	public static void main(String[] args){
		char ch;
		Scanner sc=new Scanner(System.in);
		ch=sc.next().charAt(0);
		char a[]={'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
		char b[]={'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
		for(int i=0;i<a.length && i<b.length;i++){
			if(ch==a[i] || ch==b[i]){
				System.out.println("Alphabet");
				break;
			}
			else
			{
				System.out.println("Not Alphabet");
				break;
			}
				}

	}

}
