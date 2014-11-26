public class MailClient
{
    //Servidormdel mensage
    private MailServer server;
    //Usuario del mensage
    private String user;
    
    /**
     * Constructor for objects of class MailClient
     */
    public MailClient(MailServer Server, String User)
    {
        this.server = Server ;
        this.user = User;
    }

    /**
     * Devuelve el mail concreto del usuario
     */
    public MailItem getNextMailItem()
    {
        return server.getNextMailItem(user);
    }

    /**
     * 
     */
    public void printNextMailItem()
    {
        MailItem item = server.getNextMailItem(user);
        if (item == null)
        {
            System.out.println("No hay ningun mensaje");
        }
        else
        {
            item.print();
        }
    }

    public void sendMailItem(String to, String message, String subject)
    {
        MailItem item = new MailItem(user, to, message, subject);
        server.post(item);
    }
}
