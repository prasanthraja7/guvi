#include<stdio.h>
void main()
{
int a,b,c,t;
printf("enter the value of a,b and c/n");
scanf("%d%d%d",&a,&b,&c);
printf("before swaping\na=%d\nb=%d\nc=%d\n",a,b,c);
t=c;
c=b;
b=a;
a=t;
printf("after swaping\na=%d\nb=%d\nc=%d\n",a,b,c);
}
