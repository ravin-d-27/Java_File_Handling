import java.io.*;
import java.util.*;

public class write
{
    public static void main(String[] args) throws Exception
    {

        try
        {
            Scanner sc = new Scanner(System.in);
            
            System.out.println("Enter a message to write into the file: ");
            String message = sc.nextLine();

            PrintWriter writer1 = new PrintWriter(new File("file_write.txt"));
            writer1.write(message);

            writer1.close();
            sc.close();
        }

        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
        
    }
}

