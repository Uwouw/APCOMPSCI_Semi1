import java.util.Scanner;
public class ReverseNumber
{
	
	public static void main(String[]args)
	{
		Scanner user_input = new Scanner(System.in);
		
		System.out.println("Input number");
		int number = user_input.nextInt();
		int num = number;
		
		int rev = 0;
		
		getReverse(num, rev);
		
		System.out.println(number + " reverse is " + rev);
	}
	public static void getReverse(int num, int rev)
		{
			while(num > 0)
			{
				rev *= 10;
				rev = rev + (num % 10);
				num /= 10;
			}
			
		}
}