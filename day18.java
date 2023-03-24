import java.util.Scanner;

class day18
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value of a");
		int a=sc.nextInt();
		System.out.println("enter the value of b");
		int b=sc.nextInt();
		System.out.println("enter the value of c");
		int c=sc.nextInt();
		System.out.println("enter the value of d");
		int d=sc.nextInt();
		int common=b*d/gcd(a,b);
		int sum=a*(common/b)+c*(common/d);
		int common_divisor=gcd(sum,common);
		System.out.println("The sum of the fractions is: " + sum + "/" + common);
	}
		public static int gcd(int a, int b) 
		{

			if (b == 0) 
			{
				return a;
			} else 
			{
				return gcd(b, a % b);
			}

		}
	}

