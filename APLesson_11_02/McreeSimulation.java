import java.util.*;
public class McreeSimulation
{
	public static void main(String[]args)
	{
		int bulletCount = 96;
		int shotCount = 0;
		String[] clip = new String[16];
		resetClip();
		
		while(bulletCount > 0 || shotCount > 0)
		{
			System.out.println("Action: R /"reload/" or S /"shoot/"");
			if(action == "R")
			{
				reload();
			}
			if(action == "S")
			{
				shoot(shotCount);
			}
			printClip();
		}
		System.out.println("You ran out of bullet >:/");
	}
	public static void resetClip()
	{
		for(i = 0; i < clip.length; i++)
		{
			clip[i] = "[]";
		}
	}
	public static void shoot(int shotCount)
	{
		if(shotCount > 0)
		{
			
		}
		else
		{
			System.out.println("Reload *click*");
			return;
		}
	}
	public static void reload()
	{
		if(int bulletCount >= clip.length)
		{
			clip.length 
		}
		else
		{
			int shotCount = (bulletCount);
			int bulletCount = 0;
			
		
		}
		resetClip();
		for(i = 0; i < shotCount; i++)
		{
			clip[i] = " * ";
		}
	}
	public static void printClip()
	{
		
	}
}