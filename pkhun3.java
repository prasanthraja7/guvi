import java.util.Scanner;
public class inde3 {
public static void main(String arg[]){
	int p[]=new int[6];
	System.out.println("enter the elements ");
	Scanner dd=new Scanner(System.in);
	for(int i=0;i<6;i++){
		p[i]=dd.nextInt();
	}
	int index;
	System.out.println("the index num");
	index=dd.nextInt();
		for(int j=0;j<6;j++){
		if(p[j]==index){
			System.out.println("the number is equal to index is "+p[j]);
		}
		}
}
}
