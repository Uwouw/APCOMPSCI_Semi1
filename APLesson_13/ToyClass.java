abstract public class ToyClass
{
	private String name;
	private double count;
	
	public ToyClass()
	{
		name = "";
		count = 1;
		
	}
	public ToyClass(String n)
	{
		name = n;
		count = 1;
	}
	public String getName()
	{
		return name;
	}
	public double getCount()
	{
		return count;
	}
	public void setName(String n)
	{
		name = n;
	}
	public void setCount(double c)
	{
		count = c;
	}
	abstract public String getType();
	
	public String toString()
	{
		return name + " " + count;
	}
}