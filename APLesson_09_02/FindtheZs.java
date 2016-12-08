import java.util.Scanner;
public class FindtheZs
{
	static Scanner user_input = new Scanner(System.in);
	public static void main(String[]args){
		
		String[] words = new String[5];
		words = fillArray(words);
		System.out.println("The word:: ");
		printArray(words);
		System.out.println("\n Zs in the word:: ");
		System.out.println(hasZs(words));
	}
	public static String[] fillArray(String[] words){
		
		for(int i = 0; i < words.length; i++){
			System.out.println("Enter word " + (i + 1) + ":: ");
			words[i] = user_input.next();
		}
		return words;
	}
	public static void printArray(String[] words){
		
		for(int i = 0; i < words.length; i++){
			System.out.print(words[i] + " ");
		}
	}
	public static String hasZs(String[] words){
		
		String zs = "";
		for(String word : words)
		{
			if(word.indexOf("z") >= 0)
			{
				zs += word + " ";
			}
			
		}
		return zs;
	}
}