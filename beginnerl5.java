import java.io.*;
import java.util.*;
class Oddnumbti
{
public static void main(String[] args)
{
int p,n;
Scanner in=new Scanner(System.in);
System.out.println("Enter the value");
p=in.nextInt();
n=in.nextInt();
for(int i=p;i<=n;i++)
{
if(i%2!=0)
{
System.out.println(i);
}
}
}
}
