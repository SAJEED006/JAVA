import java.util.Scanner;
class day9
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter the integer");
int n=sc.nextInt();
int count=0;
if(n==0)
System.out.println("number of digits are 1");
else
{
while(n!=0)
{
n=(n/10);
count++;
}
System.out.println("the number of digits are "+count);
}
}
}