import java.util.Scanner;
public class Reverse_Triangle
{
	public static void main(String[]args)
	{
		Scanner user_input = new Scanner(System.in);
		System.out.println("Hello I am Mr.Subtract each letter in every loop");
		System.out.print("Enter a word:: ");
		String word = user_input.next();
		
		for(int i = word.length(); i >= 0 ;  i--)
		{
			System.out.println(word.substring(0, i));
		}
	}
}