import java.util.Scanner;
class day2
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter the character");
char c=sc.next().charAt(0);
if(c>=’A’&&c<=’Z’||c>=’a’&&c<=’z’)
System.out.println("input is alphabet");
else
System.out.println("invalid output");
}
}