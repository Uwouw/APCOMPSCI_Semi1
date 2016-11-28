import java.util.Scanner;
public class Firstletter
{
	public static void main(String[]args)
	{
		Scanner user_input = new Scanner(System.in);
		
		System.out.println("Please input 5 words");
		String[] words = new String[5];
		
		for(int i = 0; i <= 4; i++)
		{
			System.out.print("");
			words[i] = user_input.nextLine();
		}
		
		first(words);
		
	}
	public static void first(String[] words)
	{
		for(String word : words)
		{
			System.out.println(word.charAt(0) + " ");
		}
	}
}