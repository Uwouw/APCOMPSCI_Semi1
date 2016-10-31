import java.util.Scanner;
public class Right_Triangle
{
	public static void main(String[]args)
	{
		System.out.println("Hello my name is Mr.Output Word from Top to Bottom guy??");
		
		Scanner user_input = new Scanner(System.in);
		System.out.println("Enter a word");
		String word = user_input.next();
		
		for(int i = word.length(); i >= 0; i--)
		{
			System.out.println(word.substring(i, word.length()));
		}
	}
}