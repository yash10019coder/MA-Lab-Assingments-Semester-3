package Question6;
import java.net.*;  
public class Main
{  
  public static void main(String[] args) throws Exception {  
    DatagramSocket socket = new DatagramSocket();  
    String str = "Hello World";  
    InetAddress ip = InetAddress.getByName("127.0.0.1");  
    DatagramPacket packet = new DatagramPacket(str.getBytes(), str.length(), ip, 3000);  
    socket.send(packet);  

    System.out.println("Address: "+ packet.getAddress());
    System.out.println("Data: "+ packet.getData());
    System.out.println("Length: "+ packet.getLength());
    System.out.println("Offset: "+ packet.getOffset());
    System.out.println("Socket Address: "+ packet.getSocketAddress());
    packet.setPort(1024);
    socket.close();  
  }  
}
