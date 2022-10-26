import java.util.*;
import java.io.*;

public class file_writer
{
    public static void main(String[] args) throws Exception
    {
        try
        {
            FileWriter writer = new FileWriter("newFile_writer2.txt");
            Scanner sc =new Scanner(System.in);

            System.out.println("Enter the text to write into the file:");
            String data = sc.nextLine();

            writer.write(data);

            sc.close();
            writer.close();
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
        
    }    
}
