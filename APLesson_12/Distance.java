import java.util.*;
public class MPHRunner {
    static Scanner user_input = new Scanner(System.in);
    static int d, hrs, min;
    public static void main(String[]args){
        System.out.println("Enter a distance");
        d = user_input.nextInt();
        System.out.println("Enter the hours");
        hrs = user_input.nextInt();
        System.out.println("Enter the minutes");
        min = user_input.nextInt();
        MPH miles = new MPH();
        miles.setVars(d, hrs, min);
        System.out.println(d + " miles in " + hrs + " hours and " + min + " minutes results in a speed of " + miles.getMPH() + " MPH.");
    }
}