public class GameSystem 
{
    String platform;
    int serialNum;

    public GameSystem()
	{
        
		this.platform = " ";
        
		this.serialNum = 1 + (int)(Math.random()*9999999);
    }

    public GameSystem(String platform)
	{
        this.platform = platform;
        this.serialNum = 1 + (int)(Math.random()*9999999);
    }

    public String getPlatform() 
	{
        return platform;
    }

    public int getSerialNum() 
	{
        return serialNum;
    }
}