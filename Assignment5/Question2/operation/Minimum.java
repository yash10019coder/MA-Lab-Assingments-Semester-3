package Question2.operation;

public class Minimum 
{
 public int findMin(int arr[])
 {
     int min =arr[0];
     for(int i=0;;i++)
     {
         try
         {
            if(min>arr[i])
            min=arr[i];
         }
         catch(ArrayIndexOutOfBoundsException e)
         {
             return min;
         }
     }
 }    
}
