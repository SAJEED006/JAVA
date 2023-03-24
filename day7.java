import java.util.Scanner;
class day7
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter the month ");
int m=sc.nextInt();
System.out.println("enter the year");
int y=sc.nextInt();
if((m==2)&&(y%4==0)||(y%100!=0)||(y%400==0))
System.out.println("month has 29 days");
else if(m==2)
System.out.println("month has 28 days");
else if(m==1||m==3||m==5||m==7||m==8||m==10||m==12)
System.out.println("month has 31 days");
else
System.out.println("month has 30 days");
}
}