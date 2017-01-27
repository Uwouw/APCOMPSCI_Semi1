import java.util.*;
public class HumanRunner {
    static Scanner user_input = new Scanner(System.in);
    public static void main(String args[]){
        
        System.out.print("Enter your hair: ");
        String hair = user_input.nextLine();
        
		System.out.print("Enter your eyes:: ");
        String eyes = user_input.nextLine();
        
		System.out.print("Enter your skin:: ");
        String skin = user_input.nextLine();
        
		Human Human = new Human(hair, eyes, skin);
        
		System.out.println("Your Info \nHair: "+ Human.getHair());
        
		System.out.println("Eyes: "+ Human.getEyes());
        
		System.out.println("Skin: "+ Human.getSkin());
        
		System.out.print("Enter someone else's hair:: ");
        hair = user_input.nextLine();
        
		System.out.print("Enter their eyes:: ");
        eyes = user_input.nextLine();
        
		System.out.print("Enter their skin:: ");
        skin = user_input.nextLine();
        Human.setHair(hair);
        Human.setEyes(eyes);
        Human.setSkin(skin);
        
		System.out.println("Someone else's Info \nHair: "+ Human.getHair());
        
		System.out.println("Eyes: "+ Human.getEyes());
        
		System.out.println("Skin: "+ Human.getSkin());
    }
}