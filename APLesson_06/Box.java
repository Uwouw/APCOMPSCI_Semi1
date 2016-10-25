import java.util.Scanner;
public class Box
{
	public static void main(String[]args)
	{
		Scanner user_input = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = user_input.nextInt();
		
		for(int i = 0; i <= num; i++)
		{
			System.out.print(i + " ");
		}
	}
}