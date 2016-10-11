import java.util.Scanner;
public class Ex_01
{
	
	
	public static void main(String[]args)
	{
		 String Random wild = new Random();
		
		int player = wild.nextInt(1-7);
		int computer = wild.nextInt(1-7);
		
		System.out.println("You rolled a " + player);
		System.out.println("The computer rolled a " + computer);
		
		boolean truth = true;
		if(truth)
		{
			System.out.println("Congratz you beat the computer you should feel proud because it will be your last")
		}
		if(!truth)
		{
			System.out.println("Zaneendesune.Pasokonnohougaplayeryoritsuyoidesu.")
		}
		rollDice(); 
	}
	public static rollDice(int player, int computer )
	{
		if(player > computer)
		{
			return true
		}
		
		if(computer > player)
		{
			return false
		}
	}
	
}