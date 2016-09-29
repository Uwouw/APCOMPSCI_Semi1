import java.util.Scanner;
public class Ex_04
{
	public static void main(String[]args)
	{
		Scanner user_input = new Scanner(System.in);
		Ex_04 volume = new Ex_04();
		System.out.println("Hello! I am Mr.The Volume of a Cube in inches and feet Calculator!\n");
		
		System.out.println("Please input the height in inches:");
		double height = user_input.nextDouble();
		
		System.out.println("Please input the length in inches:");
		double length = user_input.nextDouble();
		
		System.out.println("Please input the width in inches:");
		double width = user_input.nextDouble();

		
		System.out.println("The volume of your cube in cubic inches is " + height*length*width + "\n" );
		
		
		System.out.printf("And the volume of your cube in cubic feet is \"%1.2f\" Now I can take over the world!\n", volume.calcVolfeet(height, length, width));
		
	}
	public double calcVolfeet(double height, double length, double width)
	{
		return (height*length*width)/1728;
	}
}