import java.util.Scanner;
public class Rectangle 
{
	static double l;
	static double w;
	static double perimeter;
	
	public static void main(String[]args)
	{
		Scanner user_input = new Scanner(System.in);
		System.out.println("Hello I am Mr.The Perimeter of a Square Calculator!\n");
		System.out.println("Please input the length in inches:");
		l = user_input.nextDouble();

		System.out.println("Please input the width in inches:");
		w = user_input.nextDouble();
		
		calcPerim();
		print();
	}
	public static void calcPerim()
	{
		perimeter = 2 * l + 2 * w;
	}
	public static void print()
	{
		System.out.printf("I have gathered the data and the perimeter of the square is %1.5f inches", perimeter);
	}
}