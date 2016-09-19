import java.util.Scanner; 
public class Ex01
{
	public static void main(String[]args)
	{
		System.out.println("Hello my name is R00debot");
		System.out.println("I am here to ask you a few questions and comment it harshly");
		Scanner user_input = new Scanner(System.in);
		
		//prompts for user input
		System.out.println(" What is your name? ");
		String name = user_input.nextLine();
		System.out.println("Who named you that?");
		System.out.println("How old are you?");
		int age = user_input.nextInt();
		System.out.println("Did you lie about your age?");
		System.out.println(" What do you do for fun? ");
		String hobby = user_input.nextLine();
		user_input.nextLine();
		System.out.println("That is boring");
		System.out.println(" What kind of music do you like? ");
		String music = user_input.nextLine();
		System.out.println("I heard that a lot of people hate that kind of music");
		System.out.println(" How many siblings do you have? ");
		int siblings = user_input.nextInt();
		System.out.println("That is a weird number");
		System.out.println("What do you want to be when you grow up?");
		String job = user_input.nextLine();
		user_input.nextLine();
		System.out.println("That is a bit cliche");
		
		System.out.println("So I have gathered your information...");
		System.out.println("Your name is    " + name);
		System.out.println("Your age is   " + age);
		System.out.println("Your idea of \"fun\" is " + hobby);
		System.out.println("Your favorite type of music is " + music);
		System.out.println("Number of siblings is " + siblings);
		System.out.println("Your idea of what you will be in the future is being a/an   " + job);
		System.out.println("Thank you for your information... I can use this to TAKE OVER THE WORLD...!?");




	}
}