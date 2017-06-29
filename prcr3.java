import java.util.Scanner;


public class prcr3 {
	public static void main(String args[]){
		char ch;
		Scanner in=new Scanner(System.in);
		ch=in.next().charAt(0);
		char b[]={'a','e','i','o','u'};
		char c[]={'A','E','I','O','U'};
		for(int i=0;i<5;i++){
			if(ch==b[i] || ch==c[i]){
				System.out.println("The given Char is vowel");
				break;
			}
			else{
				System.out.println("The given char is consonant");
				break;
			}
		}		
   }

}
