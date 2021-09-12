package Question4;
public class Propagation 
{
  public void method1(int a,int b)
  {
    method2(a,b);
  }   
  public void method2(int a, int b)
  {
    method3(a,b);
  } 
  public void method3(int a, int b)
  {
   method4(a,b);
  }
  public void method4(int a, int b)
  {
     if(b==0)
     throw new ArithmeticException();
     else
     System.out.println("Quotient is: "+a/b);
  }

  public static void main(String args[])
  {
      Propagation obj = new Propagation();
      try
      {
        obj.method1(5, 0);
      }
      catch(ArithmeticException e)
      {
          System.out.println("Divide by zero exception has occured");
      }
  }
}
