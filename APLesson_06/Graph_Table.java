import java.util.Scanner;
public class Graph_Table 
{
	public static void main(String[]args)
	{
		Scanner user_input = new Scanner(System.in);
		System.out.println("Hello I am Mr.Creating a table for a graph");
		System.out.println("Enter a number");
		double number = user_input.nextDouble();
		
		System.out.println("Enter the size of the table");
		int size = user_input.nextInt();
		
		for(int i = 1; i <= size; i++)
		{
			System.out.println(i + " | " + i*number);
		}
		
	}
}