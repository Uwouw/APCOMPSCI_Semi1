import java.util.Scanner;
public class String
{
	public static void main(String[]args)
	{
		int[][]words = new int [4][4];
		Scanner user_input = new Scanner(System.in);
		for(int i = 0; i < words.length; i++)
		{
			for( j = 0; j < words[i].length; j++)
			{
				System.out.println("please enter a word:");
				int words[i][j] = user_input.nextInt();
			}
		}
		
		for(i = 0; i < words.length; i++)
		{
			for( j = 0; i < words[i].length; j++)
			{
				System.out.print(words[i][j]);
			}
			System.out.println("");
		}
		
	}
	
}