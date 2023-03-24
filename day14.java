import java.util.Scanner;

class day14
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number to be reversed");
        int n=sc.nextInt();
        int rev=0;
        while(n!=0)
        {
        	int digit=n%10;
        	rev=rev*10+digit;
        	n/=10;
        	
        }
        System.out.println("The reversed number is"+rev);
    }
}