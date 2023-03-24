

import java.util.Scanner;

class day15
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();
		int o=n;
		int s=0;
		while(n!=0)
		{
			int digit=n%10;
			int fact=1;
			for(int i=1;i<=digit;i++)
			{
				fact*=i;
			}
			s+=fact;
			n/=10;

		}

		if(o==s)
			System.out.println("strong number");
		else
			System.out.println("not a strong number");
	}
}