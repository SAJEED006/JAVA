import java.util.Scanner;

public class day12 {

	public static void main(String[] args) {
		int sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value of n");
		int n=sc.nextInt();
		while(n!=0)
		{
			int r=n%10;
			sum=sum+r;
			n=n/10;
		}
		System.out.println("the sum of all numbers is"+sum);

	}

}
