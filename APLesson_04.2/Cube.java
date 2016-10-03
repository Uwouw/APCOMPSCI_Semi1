import java.util.Scanner;
public class Cube
{
	static double side;
	static double sa; 
	public static void main(String[]args)
	{
		Scanner user_input = new Scanner(System.in); 
		System.out.println("Hello I am Mr.Calculate the surface area of a Cube!\n");
		System.out.println("Please input one of the side of the Cube");
		side = user_input.nextDouble();
		
		
		
		
		
		calcSurf();
		print();
	}
	public static void calcSurf()
	{
		sa = 6 * Math.pow(side, 2); 
	}
	public static void print()
	{
		System.out.printf("Ok... The surface area of a cube whose sides are %1.5f in any unit is %1.5f \n", side, sa);
		System.out.println(" \"Such math, much wow\" ");
		System.out.println("Now I can take over the world! again");
	}
}