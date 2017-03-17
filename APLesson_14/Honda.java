import java.util.*;
public class Honda implements Location
{
	private double x, y;
	
	public Honda(double[] loc){
		x = loc[0];
		y = loc[1];
	}
	
	public int getID()
	{
		return 100000  + (int)(Math.random() * 999999);
	}
	public void move(double x, double y)
	{
		this.x += x;
		this.y += y;
	}
	public double[] getLoc()
	{
		double[] Location = new double[2];
		Location[0] = x;
		Location[1] = y;
		return Location;
	}
}