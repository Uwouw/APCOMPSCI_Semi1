import java.util.Scanner;
public class Concatenation
{
	public static void main(String[]args)
	{
		
		Scanner user_input = new Scanner(System.in);
		System.out.println("Address label maker");
		
		System.out.println("Input your Name pleasee");
		String name = user_input.nextLine();
		
		System.out.println("Input your adresss pleaaze");
		String adress = user_input.nextLine();
		
		System.out.println("Input the location.");
		String location = user_input.nextLine();
		
		System.out.println("Input your zip plz");
		int zip = user_input.nextInt();
		
		System.out.println("bebeeeepepp printing out adress label");
		System.out.println("*****************************");
		System.out.println("*  " + name);
		System.out.println("*  " + adress);
		System.out.println("*  " + location + "_" + zip);
		System.out.println("*****************************");
		System.out.println("\n I over complicated myself....");
		
		
		
		
	}
	
}