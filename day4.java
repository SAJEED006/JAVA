import java.util.Scanner;
class day4
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter the number");
int n=sc.nextInt();
if(n>0)
System.out.println("the entered number is positive");
else if(n<0)
System.out.println("the entered number is negative");
else
System.out.println("neither negative or positive");
}
}
