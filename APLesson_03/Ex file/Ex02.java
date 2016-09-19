import java.util.Scanner;
public class Ex02
{
	public static void main(String[]args)
	{
		
		System.out.println("Hi I am BMI calculator!01010101");
		System.out.println("Please give me your height and weight so I can calculate for you");
		Scanner user_input = new Scanner (System.in);
		
		System.out.println("Give me your height in inches.");
		double height = user_input.nextDouble();
		
		System.out.println("Now give me your weight in pounds if you can.");
		double weight = user_input.nextDouble();
		
		double BMI = weight / (height * height) * 703;
		
		System.out.println("Ok! This is your result:  " + BMI);
	}
}