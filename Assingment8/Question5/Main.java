package Question5;
import java.net.*;
public class Main 
{
    public static void main(String args[]) throws Exception
    {
        DatagramSocket socket = new DatagramSocket();
        InetAddress address = InetAddress.getByName("localhost");
        socket.connect(address, 1024);
        System.out.println("Local Socket Address: " + socket.getLocalAddress());
        System.out.println("Port Number: " + socket.getPort());
        System.out.println("Is socket closed?: "+socket.isClosed());
        System.out.println("Is socket connected?: "+socket.isConnected());
        System.out.println("Receiver's buffer size: "+socket.getReceiveBufferSize());
        socket.send(new DatagramPacket("hello world".getBytes(), 10));
        socket.close();
    }    
}
