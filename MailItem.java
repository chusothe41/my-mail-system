public class MailItem
{
    //Remitente
    private String from;
    //Destinatario
    private String to;
    //Mensage
    private String message;

    /**
     * Constructor for objects of class MailItem
     */
    public MailItem(String newFrom, String newTo, String newMessage)
    {
        from = newFrom ;
        to = newTo;
        message = newMessage;
    }

    /**
     * Devuelve el nombre del remitente
     */
    public String getFrom()
    {
        return from;
    }

    /**
     * Devuelve el nombre del destinatario
     */
    public String getTo()
    {
        return to;
    }

    /**
     * Devuelve el mensaje escrito
     */
    public String getMessage()
    {
        return message;
    }

    /**
     * Muestra los atributos
     */
    public void print()
    {
        System.out.println("From: " + from);
        System.out.println("To: " + to);
        System.out.println("Message: " + message);

    }
}
