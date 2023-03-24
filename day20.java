
import java.util.Scanner;

class day20
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value of n");
		int n=sc.nextInt();
		boolean isprime = true;

		if(n==0||n==1)
		{
			isprime=false;
		}
		else
		{
			for (int i = 2; i <= n/2; i++)
			{
				if (n % i == 0) 
				{
					isprime = false;
					break;
				}
			}
		}


		if(isprime)
			System.out.println("Prime number");
		else
			System.out.println("Not a Prime number ");
	}
}