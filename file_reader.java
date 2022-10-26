
import java.io.*;


public class file_reader
{
    public static void main(String[] args) throws Exception
    {
        try
        {
            FileReader reader = new FileReader("file_write.txt");
            
            int i = reader.read();
            while (i!=-1)
            {
                System.out.print((char)i);
                i = reader.read();
            }

            reader.close();
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
        
    }
}
