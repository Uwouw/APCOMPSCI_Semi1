import java.util.*;
public class CarClassRunner {
    static Scanner user_input = new Scanner(System.in);
    public static void main(String[]args){
        System.out.print("Enter the paint:: ");
        String paint = user_input.nextLine();
        
		System.out.print("Enter the interior:: ");
        String interior = user_input.nextLine();
       
		System.out.print("Enter the engine configuration:: ");
        String engine = user_input.nextLine();
        
		System.out.print("Enter the wheels:: ");
        String wheels = user_input.nextLine();
        CarClass Car = new CarClass(paint, interior, engine, wheels);
        
		System.out.println("Your rice mobile is ready!");
        
		System.out.println("Paint:\t" + Car.getPaint());
        
		System.out.println("Interior:\t" + Car.getInterior());
        
		System.out.println("Engine:\t" + Car.getEngine());
        
		System.out.println("Wheels:\t" + Car.getWheels());
    }

}