import java.util.*;
public class MPH
{
<<<<<<< HEAD
	private int distance, hours, minutes;
	private double mph;
=======
	static int distance, hours, minutes;
	static long mph;
>>>>>>> origin/master
	public MPH()
	{
		distance = 0;
		hours = 0;
		minutes = 0;
		mph = 0;
	}
	public MPH(int d, int hrs, int min)
	{
		distance = d;
		hours = hrs;
		minutes = min;
		mph = 0;
	}
	public void setValues(int d, int hrs, int min)
	{
		distance = d;
		hours = hrs;
		minutes = min;
		mph = 0;
	}
	public long getMPH()
	{
		return Math.round(distance / (hours + minutes / 60));
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