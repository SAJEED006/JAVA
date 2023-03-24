import java.util.Scanner;
class day6
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter the value of x ");
int x=sc.nextInt();
System.out.println("enter the value of y");
int y=sc.nextInt();
if(x>0&&y>0)
System.out.println("first quadrant");
else if(x<0&&y>0)
System.out.println("second quadrant");
else if(x<0&&y<0)
System.out.println("third quadrant");
else if(x>0&&x<0)
System.out.println("fourth quadrant");
else
System.out.println("point lies on origin");
}
}