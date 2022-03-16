import java.util.Scanner;
class Q5
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first number");//25
		int n1=sc.nextInt();
		
		System.out.println("Enter Second number");//5
		int n2=sc.nextInt();
		
		int k = n1*n2;
		
		System.out.println(+ n1 + "x" + n2 + "=" + k);
	}
}