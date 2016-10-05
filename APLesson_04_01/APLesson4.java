public class APLesson4
{
	public static void main(String[]args)
	{
		APLesson4 form = new APLesson4();
		String word1 = "baaaa";
		double number1 = 383838.332;
		
		form.format(word1, number1);
		
		String word2 = "gmmm";
		double number2 = 929394.2342;
		form.format(word2, number2);
		
	
	}
	public void format(String word, double number)
	{
		System.out.printf("\n%10s %10.2f", word, number);
	}
	
}