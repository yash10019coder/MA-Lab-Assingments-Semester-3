package Question2;
import Question2.operation.*;
public class Main 
{
  public static void main(String args[])
  {
      Minimum obj1 = new Minimum();
      Sum obj2 = new Sum();

      int arr[]={1,2,0,7};

      int a = obj2.sum(arr);
      int b = obj1.findMin(arr);

      int ans; 
      try
      {
        ans = a/b;
        System.out.println("Value is: "+ans);
      }
      catch(ArithmeticException e)
      {
          System.out.println("Divide by zero error has occured");
      }
  }    
}
