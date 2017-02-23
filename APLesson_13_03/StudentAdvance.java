public class StudentAdvance extends Advance
{
    int daysLeft;

    public StudentAdvance(int daysLeft) 
	{
		
        super(daysLeft);
        this.daysLeft = daysLeft;
    }

    public int getPrice()
	{
        return super.getPrice()/2;
    }

    @Override
    public String toString() 
	{
        return "Ticket{" + "SerialNumber=" + getSerialNum() + ", Price=" + getPrice() + '}';
    }
}