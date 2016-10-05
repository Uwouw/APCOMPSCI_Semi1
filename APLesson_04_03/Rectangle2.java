import java.util.Scanner;
public class Rectangle2 
{
	
	public static void main(String[]args)
	{
		Scanner user_input = new Scanner(System.in);
		System.out.println("Hello I am Mr.The Perimeter of a Square Calculator!\n");
		System.out.println("Please input the length in inches:");
		double l = user_input.nextDouble();

		System.out.println("Please input the width in inches:");
		double w = user_input.nextDouble();
		print(calcPerim(l, w));
	}
	public static double calcPerim(double l, double w)
	{
		return 2 * (l+w);
	}
	public static void print(double perimeter)
	{
		System.out.printf("I have gathered the data and the perimeter of the square is %1.5f inches", perimeter);
	}
}