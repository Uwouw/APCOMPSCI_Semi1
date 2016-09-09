public class ComplexCalculation
{
	public static void main(String[]args)
	{
		System.out.println("The rectangle has a width of 8, a length of 20, and a height of 15. Find the surface area of the rectangle");
		System.out.println("The formula of the surface area of a rectangle is A = 2wl + 2lh + 2hw");
		int w = 8;
		int l = 20;
		int h = 15;
		int surfacearea = 2 * w * l + 2 * l * h + 2 * h * w;
		System.out.println("The answer will be " + surfacearea);
		
	}
}
