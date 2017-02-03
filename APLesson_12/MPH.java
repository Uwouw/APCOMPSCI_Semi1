import java.util.*;
public class MPH
{
	private int distance, hours, minutes;
	private double mph;
	public MPH()
	{
		distance = 0;
		hours = 0;
		minutes = 0;
		mph = 0;
	}
	public MPH(int distance, int hours, int minutes)
	{
		distance = d;
		hours = hrs;
		minutes = min;
		mph = 0;
	}
	public void setValues(int distance, int hours, int minutes)
	{
		distance = d;
		hours = hrs;
		minutes = min;
		mph = 0;
	}
	public void getMPH()
	{
		mph = Math.round(distance / (hours + minutes / 60));
		return mph;
	}
	public static void main(String[]args)
	{
		Scanner user_input = new Scanner(System.in);
		System.out.println("Please input a distasnce, hours, and minutes");
		int distance = user_input.nextInt();
		int hours = user_input.nextInt();
		int minutes = user_input.nextInt();
		MPH object = new MPHS(int distance, int hours, int minutes);
		System.out.println(distance + " miles in " + hours + " hours = " + mph + " mph");
	}
	
}