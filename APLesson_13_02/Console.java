public abstract class Console extends GameSystem
{
    
	String Controller;
    public Console() 
	{
        super();
    }

    public Console(String system) 
	{
        super(system);
    }

    public abstract String getController();

    public String toString() 
	{
        return "Console{" + "Platform:'" + super.getPlatform() + '\'' + " Serial Number:'" + super.getSerialNum() + '\'' + " Controller:'" + getController() + '\'' + '}';
    }
}