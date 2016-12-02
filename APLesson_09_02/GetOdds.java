public class GetOdds{
	
	public static void main(String[]args){
		int[] numbers = new int[10];
		numbers = fillArray(numbers);
		System.out.println("Numbers in list:: ");
		printArray(numbers);
		System.out.println("\nOdds in list:: ");
		getOdds(numbers);
	}
	
	public static int[] fillArray(int[] numbers){
		
		for(int i = 0; i < numbers.length; i++){
			numbers[i] = (int)(Math.random() * 100) + 1;
		}
		return numbers;
	}
	
	public static void printArray(int[] numbers){
		
		for(int i = 0; i < numbers.length; i++){
			System.out.print(numbers[i] + " ");
		}
	}
	public static void getOdds(int[] numbers){
		
	
		for(int number : numbers)
		{
			
			if(number % 2 == 1)
			{
				System.out.print(number + " ");
			}
		}
	}
}