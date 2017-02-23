public class GameRunner 
{
    
	public static void main(String[]args)
	{
        
		GameSystem PC = new PC("PC");
       
	    Console XBox = new XBox("Xbox");
        
		Console PS4 = new PlayStation("PlayStation 4 (I want one)");
        
		System.out.println(PC);
        
		System.out.println(XBox);
        
		System.out.println(PS4);
    }
}