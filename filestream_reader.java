
import java.io.*;

public class filestream_reader
{

    static void readMessage(FileInputStream f) throws Exception
    {
        try
        {
            int x = f.read();

            while (x!=-1)
            {
                System.out.print((char)x);
                x = f.read();
            }
        }

        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
        
    }
    public static void main(String[] args) throws Exception
    {
        try
        {
            FileInputStream filereader = new FileInputStream("newfile_writer.txt");

            readMessage(filereader);

            filereader.close();
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
    }    
}
