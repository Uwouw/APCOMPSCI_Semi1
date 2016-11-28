import java.util.Scanner;
public class AverageNumbers
{
	public static void main(String[]args)
	{
		Scanner user_input = new Scanner(System.in);
		int[] numbers = new int[10];
		
		for(int i = 0; i <= 9; i++)
		{
			numbers[i] = (int)(Math.random() * 100) + 1;
		}
		
		System.out.println("The Numbers are:");
		for (int number : numbers)
		{
			System.out.print(number + " ");
		}
		
		System.out.println("\n The average of the 10 numbers is: " + average(numbers));
	}
	public static int average(int[] numbers)
	{
		int sum = 0;
		for (int number : numbers)
		{
			sum += number;
		}
		
		return sum / 10;
	}
}