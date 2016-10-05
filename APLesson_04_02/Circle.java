import java.util.Scanner;
public class Circle
{
	static double r;
	static double area;
	
	public static void main(String[]args)
	{
		Scanner user_input = new Scanner(System.in);
		System.out.println("Hello! I am Mr.Calculate the area of a Circle!\n");
		System.out.println("Please input the radius of the Circle:");
		r = user_input.nextDouble();
		
		
		calcArea();
		print();
		
	}
	public static void calcArea()
	{
		area = 3.14 * Math.pow(r, 2);
	}
	public static void print()
	{
		System.out.printf("Ok... so it seems like the area of the circle with the radius %1.5f is %1.5f \n", r, area);
		System.out.println("Now I can take over the world! This is getting old..");
	}
}