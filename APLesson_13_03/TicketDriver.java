public class TicketDriver 
{
    public static void main(String[]args) 
	{
        Ticket_Superclass Corrin = new Advance(5);
        Ticket_Superclass Felicia = new Advance(10);
        Ticket_Superclass Azura = new StudentAdvance(5);
        Ticket_Superclass Kagero = new StudentAdvance(10);
        Ticket_Superclass Takumi = new Walkup();

        System.out.println(Corrin);
        System.out.println(Felicia);
        System.out.println(Azura);
        System.out.println(Kagero);
        System.out.println(Takumi);


    }
}