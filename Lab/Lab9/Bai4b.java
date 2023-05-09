import java.io.*;
public class Bai4b
{
    public static void main(String[] args)
	{
     
        File file = new File("input4b.txt");
        if (file.exists()) 
		{
            System.out.println("Co ton tai");
		} 
        else
        {
            System.out.println("Khong ton tai");
        }
    }
}