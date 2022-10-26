import java.util.*;
import java.io.*;

public class filestream_writer
{
    public static void main(String[] args) throws Exception
    {
        try
        {
            Scanner sc = new Scanner(System.in);
            FileOutputStream filewriter = new FileOutputStream("newfile_writer.txt");
            
            System.out.println("Enter the message to write: ");
            String message = sc.nextLine();
            
            byte[] arr = message.getBytes();

            filewriter.write(arr);
            System.out.println("The Message is successfully written in the file");

            sc.close();
            filewriter.close();
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
}