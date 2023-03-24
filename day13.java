import java.util.Scanner;

class day13
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the positive integer");
        int n=sc.nextInt();
        int sum=0;
        for(int i=1;i<=n;i++)
        sum+=i;
        System.out.println("The sum of natural"+n+"is:"+sum);
    }
}