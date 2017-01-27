import java.util.*;
public class MPH
{
	static int distance, hours, minutes;
	static long mph;
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
	
}