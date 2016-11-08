import java.util.Scanner;
public class DigitAdder
{
	static int sum, num;
	public static void main(String[]args)
	{
		Scanner user_input = new Scanner(System.in);
		System.out.println("Hello I am Mr.DigitAdder guy");
		System.out.println("Input number");
		num = user_input.nextInt();
		int number = num;
		
		sum = 0;
		
		sumDigits();
		
		System.out.println("The sum of the digits in " + number + " is " + sum);
	}
	public static void sumDigits()
		{
			while(num > 0)
			{
				sum = sum + (num % 10);
				num /= 10;
			}
			
		}
}