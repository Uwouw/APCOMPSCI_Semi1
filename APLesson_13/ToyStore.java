import java.util.*;
public class ToyStore
{
	private ArrayList<ToyClass> ToyList = new ArrayList<ToyClass>();
	
	public ToyStore()
	{
		loadToys("");
	}
	public ToyStore(String list)
	{
		loadToys(list);
	}
	public void loadToys(String list)
	{
		ArrayList<String> toys = new ArrayList(Arrays.asList(list.split(", ")));
		
		for(int i = 0; i < toys.size()-1; i+=2)
		{
			String name = toys.get(i);
			String type = toys.get(i + 1);
			ToyClass toy = getThatToy(name);
			if(toy == null)
			{
				if(type.equals("Car"))
				{
					ToyList.add(new Car(name));
				}
				if(type.equals("AF"))
				{
					ToyList.add(new A_Figure(name));
				}
			}
			else
			{
				toy.setCount(toy.getCount() + 1);
			}
			
		}
	}
	public ToyClass getThatToy(String name)
	{
		for(ToyClass object : ToyList)
		{
			if(object.getName().equals(name))
			{
				return object;
			}
		}
		return null;
	}
	public String getMostFrequentToy()
	{
		String name = "";
		int max = Integer.MIN_VALUE;
		for(ToyClass object : ToyList)
		{
			if( max < object.getCount())
			{
				max = (int)object.getCount();
				name = object.getName();
			}
			
		}
		return name;
	}
	public String getMostFrequentType()
	{
		int cars = 0;
		int figures = 0;
		for(ToyClass object : ToyList)
		{
			if(object.getType().equals("Car"))
			{
				cars +=1;
			}
			if(object.getType().equals("Action Figure"))
			{
				figures +=1;
			}
		}
		
		if(cars > figures)
		{
			return "Cars";
		}
		else if(figures > cars)
		{
			return "Action Figure";
		}
		else
		{
			return "Cars and Action Figures are both equal.";
		}
		
	}
	public String toString()
	{
		return ToyList + "";
	}
}