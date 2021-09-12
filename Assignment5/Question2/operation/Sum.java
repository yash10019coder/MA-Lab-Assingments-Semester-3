package Question2.operation;

public class Sum 
{
  public int sum(int arr[])
  {
    int sum =0;
    for(int i=0;;i++)
    {
        try
        {
           sum+=arr[i];
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            return sum;
        }
    }
}    
}
