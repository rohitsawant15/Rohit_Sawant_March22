//Write a Java program to print the area and perimeter of a rectangle.

import java.util.Scanner;
class Q13
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Width");
		double a=sc.nextDouble();
		
		System.out.println("Enter Height");
		double b=sc.nextDouble();
		
		double c=a*b;
		double d=(2*(a+b));
		
		System.out.println("Area is " +a +"*" +b+"=" +c);
		
		System.out.println("Perimeter is - 2*" +"(" +a+ "+" +b+ ") =" +(2*(a+b)));
		
	}
}