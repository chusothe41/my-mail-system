public class MailItem
{
    //Remitente
    private String from;
    //Destinatario
    private String to;
    //Mensage
    private String message;
    //Asunto
    private String subject;

    /**
     * Constructor for objects of class MailItem
     */
    public MailItem(String from, String to, String message, String subject)
    {
        this.subject = subject;
        this.from = from ;
        this.to = to;
        this.message = message;
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
        System.out.println("Subject: " + subject);
        System.out.println("From: " + from);
        System.out.println("To: " + to);
        System.out.println("Message: " + message);
    }
}
