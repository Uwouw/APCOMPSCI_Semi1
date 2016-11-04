import java.util.Scanner;
public class AverageDigits
{
	static int num, digits, average;
	public static void main(String[]args)
	{
		Scanner user_input = new Scanner(System.in);
		
		System.out.println("Input number");
		num = user_input.nextInt();
		int number = num;
		
		digits = 0;
		average = 0;
		
		avDigits();
		
		System.out.println("The average of the digits in " + number + " is " + average);
	}
	public static void avDigits()
		{
			while(num > 0)
			{
				digits ++;
				average = average + (num % 10);
				num /= 10;
				
			}
			average = average / digits;
		}
}