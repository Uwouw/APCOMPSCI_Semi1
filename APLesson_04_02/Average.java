import java.util.Scanner;
public class Average 
{
	static double num1;
	static double num2;
	static double num3;
	static double avg;
	
	
	public static void main(String[]args)
	{
		Scanner user_input = new Scanner(System.in);
		System.out.println("Hello! I am Mr.Calculate the Average of three numbers!\n");
		
		System.out.println("Please input the first number:");
		num1 = user_input.nextDouble();
		
		System.out.println("Please input the second number:");
		num2 = user_input.nextDouble();
		
		System.out.println("Please input the third number:");
		num3 = user_input.nextDouble();
		
		average();
		print();
		
	}
	
	public static void average()
	{
		avg = (num1 * num2 * num3) / 3; 
	}
	public static void print()
	{
		System.out.printf("Ok. I have gathered the information and the average of %1.5f, %1.5f, and %1.5f is %1.5f ", num1, num2, num3, avg);
		
	}
}