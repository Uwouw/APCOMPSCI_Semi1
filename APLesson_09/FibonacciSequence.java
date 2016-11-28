import java.util.Scanner;
public class FibonacciSequence
{
	public static void main(String[]args)
	{
		Scanner user_input = new Scanner(System.in);
		
		System.out.println("Please enter your starting number:");
		int number = user_input.nextInt();
		
		System.out.println("Please enter your sequence size:");
		int size = user_input.nextInt();
		
		int[] sequence = new int[size];
		for(int i = 0; i < sequence.length; i++)
		{
			if( i == 0 || i == 1)
			{
				sequence[i] = number;
			}
			else
			{
				sequence[i] = sequence[i - 2] + sequence[i - 1];
			}
			
			System.out.print(sequence[i] + " ");
		}
	}
}