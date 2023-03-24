import java.util.Scanner;
class day10
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter the number");
int n=sc.nextInt();
int fact=1;
if(n<0)
System.out.println("invalid number");
else
{
for(int i=1;i<=n;i++)
{
fact=fact*i;
}
System.out.println("the factorial of number is"+fact);
}
}
}
