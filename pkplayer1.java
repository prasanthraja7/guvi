import java.util.*;
import java.lang.*;
import java.io.*;
class revese
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner in=new Scanner(System.in);
		String string=in.next();
      String reverse = new StringBuffer(string).reverse().toString();
      System.out.println(reverse);
}
}
