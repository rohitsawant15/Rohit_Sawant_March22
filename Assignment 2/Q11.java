import java.util.Scanner;
class Q11
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		
			
		double rad = 7.5;
		//final double pi=3.1415;
		
		double perimeter = (2*rad*Math.PI);
		double area=(Math.PI*rad*rad);
		System.out.println("Perimeter is " + perimeter);
		System.out.println("area is " + area);
	}
}