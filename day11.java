import java.util.Scanner;
class day11
{
public static void main(String args[])
{
int a=0;
int b=1;
int c;
Scanner sc=new Scanner(System.in);
System.out.print("enter the number:");
int n=sc.nextInt();
for(int i=1;i<=n;i++)
{
System.out.println(a);
c=a+b;
a=b;
b=c;
}
}
}