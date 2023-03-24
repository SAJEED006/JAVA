
import java.util.Scanner;

class day16
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();
		int s=0;
		for(int i=1;i<n;i++)
		{
			if(n%i==0)
			{
				s+=i;
			}
		}
		
		if(s==n)
			System.out.println("perfect number");
		else
			System.out.println("not a perfect number");
	}
}