import java.util.Scanner;
public class ReverseAts
{
	static String sentence; 
	public static void main(String[]args)
	{
		
		
		Scanner user_input = new Scanner(System.in);
		System.out.println("Hello I am Mr.Replace a's to @'s in a sentence guy");
		System.out.println("Input a sentence");
		sentence = user_input.nextLine();
		replace();
		
		System.out.println(sentence);
	}
	public static void replace()
		{
			while(sentence.indexOf("a") >= 0)
			{
				sentence = sentence.substring(0, sentence.indexOf("a")) + "@" + sentence.substring(sentence.indexOf("a") +1);
				
				
			}
			
		}
}