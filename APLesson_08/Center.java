import java.util.Scanner;
public class Center
{
	static Scanner user_input = new Scanner(System.in);
	public static void main(String[]args)
	{
		System.out.println("Enter word 1");
		String word1 = user_input.next();
		
		System.out.println("Enter word 2 ");
		String word2 = user_input.next();
		
		System.out.println("Enter word 3");
		String word3 = user_input.next();
		
		System.out.println(makeCenter(word1));
		System.out.println(makeCenter(word2));
		System.out.println(makeCenter(word3));

	}
	public static String makeCenter(String word)
	{
		if(word.length() >= 20)
		{
			return word;
		}
		else
		{
			return makeCenter(" " + word + " ");
		}
	}
}