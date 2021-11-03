package Question2;
import java.io.*;
import java.net.*;
import java.util.Scanner;

public class Server 
{
    public static void main(String args[]) throws Exception
    {
        ServerSocket server = new ServerSocket(1024);
        Socket client = server.accept();
        DataInputStream input = new DataInputStream(client.getInputStream());
        DataOutputStream output = new DataOutputStream(client.getOutputStream());
        Scanner sc = new Scanner(System.in);

        String ips="",ops="";
        while(!ips.equals("bye"))
        {
            ips=input.readUTF();
            System.out.println("Message from client: "+ ips);
            ops=sc.nextLine();
            output.writeUTF(ops);
            output.flush();
        }

        server.close();
    }    
}
