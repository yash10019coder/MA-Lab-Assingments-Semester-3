package Question3;
import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;
public class ExceptionExample 
{
   public void uncheckedException(int age,int a, int b)
   {
       if(age<18)
       throw new RuntimeException("Age is inapropriate");
       else
       {
           if(b==0)
           throw new ArithmeticException("Denominator is zero");
           else
           System.out.println("Quotient is: "+a/b);
           
       }
   }   
   
   public void checkedException(int choice) throws IOException,SQLException
   {
       if(choice==1)
       {
       throw new IOException("Choice is 1, therefore  IOException is thrown");
       }
       else
       {
        throw new SQLException("Choice is not 1, therefore SQLException is thrown");
       }
   } 

   public static void main(String args[])
   {
       ExceptionExample obj = new ExceptionExample();
       try
       {
           obj.uncheckedException(14,2,3);
           obj.uncheckedException(18,1,0);
       }
       catch(ArithmeticException e)
       {
           System.out.println(e.getMessage());
       }
       catch(RuntimeException e)
       {
           System.out.println(e.getMessage());
       }


       try
       {
        obj.checkedException(1);
       }
       catch(IOException e)
       {
        System.out.println(e.getMessage()); 
       }
       catch(SQLException e)
       {
        System.out.println(e.getMessage()); 
       }
       

       try
       {
        obj.checkedException(2);
       }
       catch(SQLException e)
       {
        System.out.println(e.getMessage()); 
       }
       catch(IOException e)
       {
           System.out.println(e.getMessage());
       }


   }
}
