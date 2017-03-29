import java.util.*;
public class Toyota extends Car 
{	
	public Toyota(String coordinates){
		super(0,0);
		ArrayList<String> coord = new ArrayList<String>(Arrays.asList(coordinates.split(", ")));
		this.move(Double.parseDouble(coord.get(0)), Double.parseDouble(coord.get(1)));
	}
}