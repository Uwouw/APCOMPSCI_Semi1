import java.util.Scanner;
public class Average2 
{
	public static void main(String[]args)
	{
		Scanner user_input = new Scanner(System.in);
		System.out.println("Hello! I am Mr.Calculate the Average of three numbers!\n");
		
		System.out.println("Please input the first number:");
		double num1 = user_input.nextDouble();
		
		System.out.println("Please input the second number:");
		double num2 = user_input.nextDouble();
		
		System.out.println("Please input the third number:");
		double num3 = user_input.nextDouble();
		
		print(average(num1, num2, num3), num1, num2, num3);
		
	}
	
	public static double average(double num1, double num2, double num3)
	{
		return (num1 + num2 + num3) / 3; 
	}
	public static void print(double average, double num1, double num2, double num3)
	{
		System.out.printf("Ok. I have gathered the information and the average of " + num1 + ", " + num2 + ", and " + num3 + " is %1.5f ", average);
		
	}
}