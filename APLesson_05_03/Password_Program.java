import java.util.Scanner;
public class Password_Program
{
	static String username1 = "whatislife";
	static String password1 = "sleep";
	
	public static void main(String[]args)
	{
		
		
		passCheck();
	}
	
	
	
	public static void passCheck()
	{	
		Scanner user_input = new Scanner(System.in);
		
		System.out.println("Input the username");
		String username = user_input.nextLine();
		
		System.out.println("Input the password");
		String password = user_input.nextLine();
		if(username1.equals(username) && password1.equals(password))
		{
			System.out.println("Access granted.... opening file\n");
			System.out.println("You obtained 0 money");	
			
		}
		else
		{
			if(username1.equals(username) && !password1.equals(password))
			{
				System.out.println("Your password is incorrect try again.\n");
				passCheck();
		
			}
			
			else if(password1.equals(password) && !username1.equals(username))
			{
				System.out.println("Your username is incorrect try again.\n");
				passCheck();
			}
			
			else
			{
				System.out.println("Both of them are wrong try again.\n");
				System.out.println(":D\n");
				passCheck();
			}
		}
	}
}