import java.util.Scanner;
public class Choose_Your_Adventure_Game
{
	public static void main(String[]args)
	{
		System.out.println("booting up Adventure of adaa daa aad a...");
		Scanner user_input = new Scanner(System.in);
		System.out.println("Hello and welcome to Adventure of adaa daa aad a! You will be starting your adventure now.\n");
		
		System.out.println("You encountered a dodongo\"a monster\". What should you do?");
		System.out.println("a. Attack...\n");
		System.out.println("b. Run...\n");
		System.out.println("c. Use item...\n");
		System.out.println("d. Talk to it....\n");
		String choice = user_input.next();
		if(choice.equals("a"))
		{
			System.out.println("You used Attack... wait, what did you use to attack it?\n");
			System.out.println("Whatever.. you punched its face");
			System.out.println("Wow it was a Crit!");
			System.out.println("\"You did 0 dmg to the dadango\"");
			System.out.println("You are weak... you died from the dodongo");
		}
		else if(choice.equals("b"))
		{
			System.out.println("You couldn't runnaway because the game didn't allow you since the programmer is lazy\n");
			System.out.println("You died from the dodongo....");
		}
		else if(choice.equals("c"))
		{
			System.out.println("You looked at your inv");
			System.out.println("a.Cookie\t b.Stick\t c.A pikmin");
			String choice2 = user_input.next();
			if(choice2.equals("a"))
			{
				System.out.println("You used the cookie...\n");
				System.out.println("It was yummy but it did nothing... you died from a heartattack...");
			}
			else if(choice2.equals("b"))
			{
				System.out.println("You used the stick... you threw it\n");
				System.out.println("uhhh it bounced off its head\n");
				System.out.println("You died from the dodongo");
			}
			else if(choice2.equals("c"))
			{
				System.out.println("Why is there a pikmin?");
				System.out.println("You threw the pikmin at the dadango");
				System.out.println("Look at that thing go. Wow it destroyed the dodongo");
				System.out.println("Congratz you won!");
			}
			else
			{
				System.out.println("That wasn't one of the choice aaaa try again");
			}
		}
		else if(choice.equals("d"))
		{
			System.out.println("You confessed your love to the dodongo\n");
			System.out.println("The dodongo felt flattered, but ran away not knowing what it should say");
			System.out.println("You won?");
		}
		else
		{
			System.out.println("Uh that wasn't one of the choices... pls");
			System.out.println("Or you put the capital version of the letter");
			System.out.println("You lost m8 get 420 no scoped doritos and mountain dew dva style nerf this");
		}
	}
}