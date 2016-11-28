import java.util.Scanner;
public class Reverseword
{
	public static void main(String[]args)
	{
		Scanner user_input = new Scanner(System.in);
		System.out.println("Please input 5 words");
		String[] name = new String[5];
		
		for(int i = 0; i <= 4; i++)
		{
			System.out.print("");
			name[i] = user_input.nextLine();
		}
		
		System.out.println("In order...");
		
		for(String names : name)
		{
			System.out.println(names);
		}
		
		System.out.println("In reverse....");
		
		reverse(name);
	}
	
	public static void reverse(String[] name)
	{
		for(int i = name.length - 1; i >= 0; i--)
		{
			System.out.println(name[i]);
		}
	}
}