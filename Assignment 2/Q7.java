import java.util.Scanner;

class Q7
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number for table");
		int n=sc.nextInt();
		
		for(int i=1;i<=10;i++)
		{ int result = n*i;
			System.out.println(+n + "*" +i+ "=" +result);
		}
	}
}