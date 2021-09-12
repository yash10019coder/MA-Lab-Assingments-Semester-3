package Question1;
import java.util.Scanner;
public class Main 
{
  public static void main(String args[])
  {
     Scanner sc =new Scanner(System.in);
     System.out.println("Enter name: ");
     String name = sc.nextLine();
     System.out.println("Enter aadhar_n:");
     String aadhar_n = sc.nextLine();
     System.out.println("Enter phone number:");
     String phone_n = sc.nextLine();
     System.out.println("Enter age:");
     int age = sc.nextInt();

     Vaccine obj = new Vaccine(name,aadhar_n,phone_n,age);
     obj.verifyAge();
  }    
}
