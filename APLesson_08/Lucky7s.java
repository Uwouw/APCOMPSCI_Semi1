import java.util.Scanner;
public class Lucky7s
{
	public static void main(String[]args)
	{
		
		Scanner user_input = new Scanner(System.in);
		System.out.println("Input a number");
		int number = user_input.nextInt();
		
		System.out.println(luck(number));
		
	}
	public static int luck(int number)
	{
		if(number > 0)
		{
			if(number%10 == 7)
			{
				return 1 + (luck(number/10));
			}
			else
			{
				return (luck(number/10));
			}
		}
		else
		{
			return 0;
		}
	}
}