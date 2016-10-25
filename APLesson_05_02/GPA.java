import java.util.Scanner;
public class GPA
{
	public static void main(String[]args)
	{
		System.out.println("Hello! I am Mr.Calculate the overall GPA from all of your classes!\n");
		
		Scanner user_input = new Scanner(System.in);
		System.out.println("Enter your science grade");
		String science = user_input.next();
		
		System.out.println("Enter your math grade");
		String math = user_input.next();
		
		System.out.println("Enter your english grade");
		String english = user_input.next();
		
		System.out.println("Enter your elective grade");
		String elective = user_input.next();
		
		System.out.println("Enter your language grade ");
		String language = user_input.next();
		
		System.out.println("Enter your history grade ");
		String history = user_input.next();
		
		System.out.println("Enter your computer_science grade");
		String computer_science = user_input.next();
		
		
		
		
		double gradepoints = calcPoints(science) + calcPoints(math) + calcPoints(english) + calcPoints(elective) + calcPoints(language) + calcPoints(history) + calcPoints(computer_science);
		
		double gpa = gradepoints / 7;
		System.out.printf("Your total GPA is %1.2f", gpa);
		
	}
	
	public static double calcPoints(String grade)
	{
		if (grade.equals("A"))
		{
			return 4.0;
		}
		if (grade.equals("B"))
		{
			return 3.0;
		}
		if (grade.equals("C"))
		{
			return 2.0;
		}
		if (grade.equals("D"))
		{
			return 1.0;
		}
		else
		{
			return 0.0;
		}
	}
}