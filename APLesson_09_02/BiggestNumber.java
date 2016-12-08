public class BiggestNumber
{
	public static void main(String[]args){
		int[] numbers = new int[10];
		numbers = fillArray(numbers);
		System.out.println("Numbers in list:: ");
		printArray(numbers);
		System.out.println("\n Biggest number in list:: " + getBiggest(numbers));
	
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
	public static int getBiggest(int[] numbers){	
		int max = 0;
		for(int number : numbers){
			if(number > max){
				max = number;
			}
		}
		return max;
	}
}