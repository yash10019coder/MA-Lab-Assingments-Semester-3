package Question3;
import java.net.*;
public class urlExample 
{
    public static void main(String args[]) throws Exception
    {
        URL url = new URL("https://stackoverflow.com/questions/7520432/what-is-the-difference-between-and-equals-in-java");
        System.out.println("Protocol: "+ url.getProtocol());
        System.out.println("Host: "+url.getHost());
        System.out.println("Port: "+url.getPort());
        System.out.println("Auhtority: " +url.getAuthority());
        System.out.println("URI: "+ url.toURI());
        System.out.println("Query: "+url.getQuery());
    }    
}
