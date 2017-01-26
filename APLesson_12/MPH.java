import java.util.*;
public class MPH
{
	private int distance, hours, minutes;
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
	
}