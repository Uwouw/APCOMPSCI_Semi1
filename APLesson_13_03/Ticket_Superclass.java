public abstract class Ticket_Superclass 
{
    int SerialNum;
    public Ticket_Superclass() 
	{
        SerialNum = 1000000 + (int)(Math.random() * 9999999);
    }

    public int getSerialNum() 
	{
        return SerialNum;
    }

    public abstract int getPrice();

    @Override
    public String toString() 
	{
        return "Ticket{" + "SerialNumber=" + getSerialNum() + ", Price=" + getPrice() + '}';
    }
}