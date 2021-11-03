package Question2;
import java.io.*;
import java.net.*;
import java.util.Scanner;

public class Client 
{
    public static void main(String args[]) throws Exception
    {
        Socket client = new Socket("localhost",1024);
        DataInputStream input = new DataInputStream(client.getInputStream());
        DataOutputStream output = new DataOutputStream(client.getOutputStream());
        Scanner sc = new Scanner(System.in);

        String ips="",ops="";
        while(!ips.equals("bye"))
        {
            ops = sc.nextLine();
            output.writeUTF(ops);
            ips=input.readUTF();
            System.out.println("Message from server: "+ips);
            output.flush();
        }

        client.close();
    }
}
