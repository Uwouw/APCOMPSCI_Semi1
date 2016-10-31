import java.util.Scanner;
public class Left_Triangle
{
	public static void main(String[]args)
	{
		Scanner user_input = new Scanner(System.in);
		System.out.println("Enter a word");
		String word = user_input.next();
		
		for(int i = 0; i <= word.length(); i++)
		{
			System.out.println(word.substring(i));
		}
	}
}