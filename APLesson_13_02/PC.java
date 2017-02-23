public class PC extends GameSystem
{
    String systemInputs;

    public PC(String platform) 
	{
        super(platform);
    }

    public String getSystemInputs()
	{
        return "Keyblade Master HD";
    }
    public String toString() 
	{
        return "Console{" + "Platform:'" + super.getPlatform() + '\'' + " Serial Number:'" + super.getSerialNum() + '\'' + " System Inputs:'" + getSystemInputs() + '\'' + '}';
    }
}