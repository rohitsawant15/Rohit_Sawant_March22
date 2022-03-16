import java.util.Scanner;

	/*
	for swap  n1=n1+n2
	n2=n1-n2
	n1=n1-n2

*/
class Q15
{	
	
	public static void main(String args[])
	{
		Scanner sc= new Scanner (System.in);
		System.out.println("Enter first num :");
		double n1=sc.nextDouble();
		System.out.println("Enter Second num :");
		double n2=sc.nextDouble();
		System.out.println("Before Swap : n1 = "+n1+ " n2 = "+n2);
		n1=n1+n2;
		n2=n1-n2;
		n1=n1-n2;
		System.out.println("After Swap : n1 = "+n1+ " n2 = "+n2);
	}
}
		
		