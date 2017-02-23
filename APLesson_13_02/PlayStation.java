public class PlayStation extends Console
{

    public PlayStation() 
	{
        super();
    }

    public PlayStation(String system) 
	{
        super(system);
    }
    @Override
    public String getController() 
	{
        return "PlayStation Ultimate";
    }

    @Override
    public String getPlatform() 
	{
        return "PlayStation Unlimited Infinity Power 2.9";
    }
}