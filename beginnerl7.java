class prime
{
public static void main()
{
int i,j,p;
for(i=101;i<10000l;i++)
{
         p=0;
         for(j=2;j<i;j++)
         {
                  if(i%j==0)
                  p++;
         }
         if(p==0)
         System.out.print(i+"   ");
}
}
}
