import java.util.Scanner;
public class Count_By_X
{
	public static void main(String[]args)
	{
		Scanner user_input = new Scanner(System.in);
		System.out.println("Enter a number");
		double number = user_input.nextDouble();
		
		System.out.println("Enter a multiplier");
		int times = user_input.nextInt();
		
		for(int i = 0; number >= i; i+=times)
		{
			System.out.print(i + " \n");
		}
	}
}