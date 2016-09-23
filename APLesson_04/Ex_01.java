import java.util.Scanner;

public class Ex_01
{
	public static void main(String[]args)
	{
		
		System.out.println("Receipt program online...");
		Ex_01 receipt = new Ex_01();
		Scanner user_input = new Scanner(System.in);
		
		System.out.println("Please enter item 1:");
		
		String item1 = user_input.nextLine();
		System.out.println("Please enter the price:");
		double price1 = user_input.nextDouble();
		System.out.println("Please enter item 2:");
		user_input.nextLine();
		
		String item2 = user_input.nextLine();
		System.out.println("Please enter the price:");
		double price2 = user_input.nextDouble();
		System.out.println("Please enter item 3:");
		user_input.nextLine();
				
		String item3 = user_input.nextLine();
		System.out.println("Please enter the price:");
		double price3 = user_input.nextDouble();
		
		System.out.println("Here are the results");
		
		System.out.println("<<<<<<<<<<<<<<<<_Receipt_>>>>>>>>>>>>>>>>");
		receipt.format(item1, price1);
		receipt.format(item2, price2);
		receipt.format(item3, price3);
		
		double subtotal = price1 + price2 + price3;
		receipt.format("Subtotal:", subtotal);
		double tax = subtotal * .075;
		receipt.format("Tax:", tax);
		double total = tax + subtotal;
		receipt.format("Total:", total);
	    System.out.println("_________________________________________");
		System.out.println("*Thank you for your support... Now i can take over the world");
	//Hello World
	}
	public void format(String item, double price)
	{
		System.out.printf("* %12s ........ %10.2f *\n", item, price);
	}
}
