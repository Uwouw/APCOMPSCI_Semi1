import java.util.*;
public class Toyota implements Location  
{
	private double x, y;
	
	public Toyota(String coordinates){
		ArrayList<String> coord = new ArrayList<String>(Arrays.asList(coordinates.split(", ")));
		x = Double.parseDouble(coord.get(0));
		y = Double.parseDouble(coord.get(1));
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