import java.util.Scanner;
class day8
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
double a,b,c;
System.out.println("enter the values");
a=sc.nextDouble();
b=sc.nextDouble();
c=sc.nextDouble();
double d=b*b-4*a*c;
if(d>0)
{
System.out.println(" the two roots are real ");
System.out.println("roots are"+(-b+Math.sqrt(d))/(2*a) +"and"+(-b-Math.sqrt(d))/(2*a));
}
else if(d==0)
{
System.out.println("roots are equal");
System.out.println("roots are"+ -b/(2*a));
}
else
{
System.out.println("no real roots");
System.out.println("Roots are " + -b/(2*a) + "+i" +Math.sqrt(-d)/(2*a) + " and "+ -b/(2*a) + "-i" + Math.sqrt(-d)/(2*a));
}
}
}
