public class ToyRunner 
{
	public static void main(String[]args)
	{
		A_Figure fig1 = new A_Figure("Figure");
		Car car = new Car("Car");
		System.out.println(fig1 + " " + car);
		
		String toys = "Hotwheel, Car, G.I.Joe, AF, PennyRacer, Car, Matchbox, Car, Star Wars, AF, Pullback, Car, Star Wars, AF";
		ToyStore store = new ToyStore(toys);
		System.out.println(store);
		System.out.println("" + store.getMostFrequentToy());
		System.out.println("" + store.getMostFrequentType());
	}
}