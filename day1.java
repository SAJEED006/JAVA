import java.util.Scanner;
class day1
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter the character");
char c=sc.next().charAt(0);
if(c=='A'||c=='E'||c=='I'||c=='O'||c=='U'||c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
System.out.println("it is vowel");
else if(c>='A'&&c<='Z'||c>='a'&&c<='z')
System.out.println("it is consonant");
else
System.out.println("invalid");
}
}