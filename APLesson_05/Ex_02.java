import java.util.Scanner;
public class Ex_02
{
	public static void main(String[]args)
	{
		Ex_02 receipt = new Ex_02();
		Scanner user_input = new Scanner(System.in);
		//items---------------------------------------
		System.out.println("What is your first item?");
		String item1 = user_input.next();
		System.out.println("What is the price of it?");
		double price1 = user_input.nextDouble();
		
		System.out.println("What is your second item?");
		String item2 = user_input.next();
		System.out.println("What is the price of it?");
		double price2 = user_input.nextDouble();
		
		System.out.println("What is your third item?");
		String item3 = user_input.next();
		System.out.println("What is the price of it?");
		double price3 = user_input.nextDouble();
		
		System.out.println("What is your fourth item?");
		String item4 = user_input.next();
		System.out.println("What is the price of it?");
		double price4 = user_input.nextDouble();
		
		//calculations--------------------------------------
		double Subtotal = price1 + price2 + price3 + price4;
		double tax = Subtotal * .075;
		double discount = discount(Subtotal);
		double total = Subtotal - discount + tax;
		
		//print receipt--------------------------------------
		System.out.println("<<<<<<<<<<_Receipt_>>>>>>>>>>");
		receipt.format(item1, price1);
		receipt.format(item2, price2);
		receipt.format(item3, price3);
		receipt.format(item4, price4);
		receipt.format("Subtotal:", Subtotal);
		receipt.format("Discount:", discount);
		receipt.format("Tax:", tax);
		receipt.format("Total:", total);
		System.out.println("_____________________________");
		System.out.println("Thank you. Come agai- error eeeerrrorr e e e e  e e- 404.3.3.5252323");
		
	}
	public static double discount(double Subtotal)
	{
		if(Subtotal >= 2000)
		{
			return  Subtotal * .15;
		}
		return 0.0;
	}
	public void format(String item, double price)
	{
		System.out.printf("* %10s ....... %10.2f *\n", item, price);
	}
}