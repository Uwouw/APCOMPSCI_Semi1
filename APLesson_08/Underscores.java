import java.util.Scanner;
public class Underscores
{
	
	public static void main(String[]args)
	{
		Scanner user_input = new Scanner(System.in);
		System.out.println("Freaking input a fkajdsfkljsfs sentence");
		String sentence = user_input.nextLine();
		
		System.out.println(replace(sentence));
	}
	public static String replace(String sentence)
	{
		while(sentence.indexOf (" ") > 0)
		{
			return replace(sentence.substring(0, sentence.indexOf(" ")) + "_" + sentence.substring(sentence.indexOf(" ") + 1));
		}
		
		return sentence;
	}
}