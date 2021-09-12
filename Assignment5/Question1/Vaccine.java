package Question1;
import Question1.information.Citizen;

public class Vaccine extends Citizen
{
     public Vaccine(String name, String aadhar_n, String phone_n, int age)
     {
      super(name,aadhar_n,phone_n,age);
     } 

     public void verifyAge()
     {
         try
         {
           if(this.age<18)
           throw new Exception();
           else
           System.out.println("You are elegible for vaccination.");
         }
         catch(Exception e)
         {
             System.out.println("You are not eligible for vaccination.");
         }
     }
}
