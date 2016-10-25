import java.util.Scanner;
public class Password_Program
{
	static String username1 = "umm";
	static String password1 = "test";
	
	public static void main(String[]args)
	{
		Scanner user_input = new Scanner(System.in);
		
		System.out.println("Input the username");
		String username = user_input.nextLine();
		
		System.out.println("Input the password");
		String password = user_input.nextLine();
		
		passCheck(username, password);
	}
	
	
	
	public static void passCheck(String username, String password);
	{
		if(username1.equals(username) && password1.equals(password))
		{
			System.out.println("Access granted.... opening file\n");
			System.out.println("Obtained 0 money");	
			return
		}
		else
		{
			if(username1.equals(username) && !password1.equals(password))
			{
				System.out.println("Your password is incorrect try again.");
				
			}
			
			if(password1.equals(password) && !username1.equals(username))
			{
				System.out.println("Your username is incorrect try again.");
				
			}
			
			else
			{
				System.out.println("Both of them are wrong try again.\n");
				System.out.println("");
				
			}
		}
	}
}