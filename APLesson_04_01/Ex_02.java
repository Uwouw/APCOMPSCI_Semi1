import java.util.Scanner;
public class Ex_02
{
	public static void main(String[]args)
	{
		Ex_02 ID_Card = new Ex_02();
		Scanner user_input = new Scanner(System.in);
		System.out.println("ID Card Maker online...");
		System.out.println("Enter your first name:");
		String name1 = user_input.nextLine();
		
		System.out.println("Enter your last name:");
		String name2 = user_input.nextLine();
		
		System.out.println("Enter your title:");
		String title = user_input.nextLine();
		
		System.out.println("Enter the school's name:");
		String school = user_input.nextLine();
		
		System.out.println("Enter the school year:");
		String year = user_input.nextLine();
		
		System.out.println("What is your favorite class?");
		String favorite = user_input.nextLine();
		
		System.out.println("-----------ID Card-----------");
		System.out.println("*****************************");
		ID_Card.format(school, year);
		ID_Card.format(name1, name2);
		ID_Card.format(title, favorite);
		System.out.println("*****************************");
		//Hello world
	}
	public void format(String ob1, String ob2)
	{
		System.out.printf("* %12s %12s *\n", ob1, ob2);
	}
}