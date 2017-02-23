public class XBox extends Console
{
    public XBox() 
	{
        super();
    }

    public XBox(String system) 
	{
        super(system);
    }


    @Override
    public String getController() 
	{
        return "XBox Wireless Controller";
    }
    @Override
    public String getPlatform()
	{
        return "XBox";
    }
}