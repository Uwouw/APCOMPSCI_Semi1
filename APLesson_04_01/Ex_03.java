import java.util.Scanner;
public class Ex_03
{
	public static void main(String[]args)
	{
		Scanner user_input = new Scanner(System.in);
		System.out.println("Hello! I am back. Mr.Calculate the total monthly payment amount on a loan guy!");
		System.out.println("\nPlease give me the following numbers....");
		
		System.out.println("\nPlease give me the principal (the original amount you intend to borrow)");
		double principal = user_input.nextDouble();
		
		System.out.println("Please give me the interest rate");
		double interest = user_input.nextDouble();
		
		System.out.println("Please give me the nnnnnumber of times the loan is compounded per year");
		double number = user_input.nextDouble();
		
		System.out.println("PPPlease give me the life of the loan....in years");
		double life = user_input.nextDouble();
		
		Ex_03 amount = new Ex_03();
		
		System.out.println("Your monthly payment will be " + amount.payment(interest, principal, life, number));
	}
	public double payment(double r, double p, double t, double n)
	{
		return p*(Math.pow(1+r/n, n*t))/(t*12);
	}
}
