import java.util.Scanner;

class day19
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value of n");
		int n=sc.nextInt();
		int temp=n;
		int sum=0;
		while(temp>0)
		{
			  int digit = temp % 10;
		         sum += Math.pow(digit,3);
		         temp /= 10;
		}
		if(n==sum)
			System.out.println("Armstrong number");
		else
			System.out.println("Not a Armstrong number ");
	}
}