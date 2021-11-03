/*1) httpURLConnection ()
2) getFollowRedirects()
3) getHeaderFieldDate()
4) getRequestMethod()
5) setFixedLengthStreamingMode()
6) usingProxy()*/
package Question4;
import java.net.*;
public class Main 
{
    public static void main(String args[]) throws Exception
    {
        URL url = new URL("http://stackoverflow.com/questions/7520432/what-is-the-difference-between-and-equals-in-java");
        HttpURLConnection hconnection = (HttpURLConnection)(url.openConnection()); 

        System.out.println("Should http redirect be automatically followed?: " + hconnection.getFollowRedirects());
        System.out.println("getHeaderFieldDate() : "+hconnection.getHeaderFieldDate("Last-Modified", 0));
        System.out.println("Request Method: "+hconnection.getRequestMethod());
        System.out.println("usingProxy(): " + hconnection.usingProxy());
        hconnection.disconnect();
        hconnection.setFixedLengthStreamingMode(200);
        
    }    
}
