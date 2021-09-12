package Question5;
import java.util.Scanner;
public class FinallyExample 
{
   public void UseServices(int password)
   {
     if(password!=1234)
     {
         throw new RuntimeException("Password is wrong");
     }
     else
     {
         System.out.println("You are using the services");
     }
   }  
   
   public void seeDemo(int code)
   {
    if(code!=1)
    {
        throw new RuntimeException("Code expired");
    }
    else
    {
        System.out.println("You are watching the demo");
    } 
   }

   public static void main(String args[])
   {
       Scanner sc = new Scanner(System.in);
       FinallyExample obj = new FinallyExample();

       try
       {
           System.out.println("Enter your password: ");
           int pass = sc.nextInt();
           obj.UseServices(pass);
       }
       catch(RuntimeException e)
       {
           System.out.println(e.getMessage());
       }
       finally
       {
          System.out.println("Enter your code for demo: ");
          int code = sc.nextInt();
        try
        {
            obj.seeDemo(code);
        }
        catch(RuntimeException e )
        {
            System.out.println(e.getMessage());
        }
       }

   }
}
