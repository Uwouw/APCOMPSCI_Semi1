import java.util.Scanner;
public class Song
{
	static String song = "";
	
	public static void main(String[]args)
	{
		System.out.println("Hello I am Mr.Singing repeated words guy.");
		Sing("Running", 4);
		Sing("Around", 4);
		Sing("At", 3);
		Sing("The Speed of Sound got places to go GOTTA FOLLOW MY RAINBOW- Sonic", 1);
		System.out.println(song);
	}
	public static void Sing(String word, int repeat)
	{
		for(int i = 1; i <= repeat; i++)
		{
			song = song + word + " ";
		}
		song = song + "\n";
	}
}