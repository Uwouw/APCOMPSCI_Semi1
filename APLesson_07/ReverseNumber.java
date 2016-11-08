import java.util.Scanner;
public class ReverseNumber
{
	static int rev, number, num = 0;
	public static void main(String[]args)
	{
		Scanner user_input = new Scanner(System.in);
		System.out.println("Hello I am Mr.Reverse the order of the number guy");
		System.out.println("Input number");
		number = user_input.nextInt();
		num = number;
		
		
		
		getReverse();
		
		System.out.println(number + " reverse is " + rev);
	}
	public static void getReverse()
		{
			while(num > 0)
			{
				rev *= 10;
				rev = rev + (num % 10);
				num /= 10;
			}
			
		}
}