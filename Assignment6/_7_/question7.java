package _7_;
public class question7 
{
    public void finalize()
    {
        System.out.println("Object has been garbage collected.");
    }
    public static void main(String args[]) throws Exception
    {
        new question7();
        new question7();
        new question7();

        Runtime.getRuntime().exec("notepad");  
        Runtime.getRuntime().exec("cmd.exe /c echo. > mythread.java");
        System.gc();
    }
}

//Notepad gets opened
//A new file is also created