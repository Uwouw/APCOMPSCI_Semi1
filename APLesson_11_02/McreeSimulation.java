import java.util.*;
public class McreeSimulation
{
	static int bulletCount;
	static int shotCount;
	static String[] clip;
	static int CLIPSIZE = 16;
	
	
	public static void main(String[]args)
	{
		bulletCount = 96;
		shotCount = 0;
		clip = new String[CLIPSIZE];
		resetClip();
		System.out.println("It's high noon somewhere in the world");
		while(bulletCount > 0 || shotCount > 0)
		{
			Scanner user_input = new Scanner(System.in);
			System.out.println("Action: R \"reload\" or S \"shoot\"");
			String action = user_input.next();
			if(action.equals("R"))
			{
				reload();
			}
			if(action.equals("S"))
			{
				shoot();
			}
			printClip();
		}
		System.out.println("You ran out of bullet >:/");
	}
	public static void resetClip()
	{
		for(int i = 0; i < clip.length; i++)
		{
			clip[i] = "[]";
		}
	}
	public static void shoot()
	{
		if(shotCount > 0)
		{
			clip[shotCount - 1] = "[]";
			shotCount -= 1;
			System.out.println("It's HIGH NOON pew\n");
			return;
		}
		else
		{
			System.out.println("Reload *click*");
			return;
		}
	}
	public static void reload()
	{
		if(bulletCount >= clip.length)
		{
			 bulletCount -= CLIPSIZE; 
			 shotCount = CLIPSIZE;
		}
		else
		{
			int shotCount = bulletCount;
			int bulletCount = 0;
			
		
		}
		resetClip();
		for(int i = 0; i < shotCount; i++)
		{
			clip[i] = " * ";
		}
	}
	public static void printClip()
	{
		String output = " ";
		System.out.println("Bullets:\t" + bulletCount + "\nClip:\t");
		for(int i = 0; i < clip.length; i++)
		{
			output += clip[i];
		}
		System.out.println(output);
	}
}