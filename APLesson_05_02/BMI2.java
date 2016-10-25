import java.util.Scanner;
public class BMI2
{
	
	static String condition;
	public static void main(String[]args)
	{
		System.out.println("Hello! I am Mr.BMI calculator and rank of physical condition!\n");
		
		Scanner user_input = new Scanner(System.in);
		System.out.println("Please enter your height in inches:");
		double height = user_input.nextDouble();
		
		System.out.println("Please enter your weight in pounds:");
		double weight = user_input.nextDouble();
		
		double BMI = weight / (height * height); 
		calcCondish(BMI);
		
		System.out.println("Your BMI is " + BMI);
		System.out.println("Your condition is " + condition);
	}
	public static void calcCondish(double BMI)
	{
		if(BMI > 0 && BMI <= 18.5)
		{
			condition = "Wow hosso";
		}
		
		if(BMI > 18.5 && BMI <= 24.9)
		{
			condition = "Futsuno";
		}
		
		if(BMI > 24.9 && BMI <= 29.9)
		{
			condition = "Overweight";
		}
		
		if(BMI > 29.9 && BMI <= 34.9)
		{
			condition = "Obese";
		}
		
		if(BMI > 34.9 && BMI <= 39.9)
		{
			condition = "Sugoku Obese";
		}
		
		if(BMI > 39.9)
		{
			condition = "holy moly you need to check that";
		}
	}
}