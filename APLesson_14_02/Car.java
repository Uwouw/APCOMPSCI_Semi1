import java.util.*;
public class Car implements Location 
{
	private double x;
	private double y;
	public int ID;
	
	public Car(){
		ID = 100000  + (int)(Math.random() * 999999);
	}
	
	public Car(double X, double Y)
	{
		x = X;
		y = Y;
		
		ID = 100000  + (int)(Math.random() * 999999);
	}
	
	
	public int getID()
	{
		return ID;
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