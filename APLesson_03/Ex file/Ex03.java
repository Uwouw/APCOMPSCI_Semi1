import java.util.Scanner;
public class Ex03
{
	public static void main(String[]args)
	{
		Scanner user_input = new Scanner (System.in);
		System.out.println("Hello I am Mr.Calculator of the Surface Area of a Traingular Pyramid guy!");
		System.out.println("I am here to calculate the surface area of a traingular pyramid!");
		System.out.println("Lets first find the area of the traingular pyramid's base");
		
		System.out.println("Insert the length of the base");
		double length = user_input.nextDouble();
		System.out.println("Now the width of the base");
		double width = user_input.nextDouble();
		
		double base = width * length; 
		
		System.out.println("Now input the area of one of the pyramid's faces");
		System.out.println("Input the base of the face");
		double base_traingle = user_input.nextDouble();
		System.out.println("Input the height of the face");
		double height_traingle = user_input.nextDouble();
		
		double face = .5 * base_traingle * height_traingle; 
		double surfacearea =  base + 3 * face;
		
		System.out.println("Nice! Now I can calculate the surface area of the traingular pyramid!");
		System.out.println("Here is the result:" + surfacearea);
	}
}