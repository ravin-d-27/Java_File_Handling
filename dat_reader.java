import java.io.*;

public class dat_reader
{
    public static void main(String[] args)
    {
        try
        {
            FileInputStream reader = new FileInputStream("testing_dat.dat");
            
            int i = reader.read();
            while (i!=-1)
            {
                System.out.print((char)i);
                i = reader.read();
            }

            reader.close();
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
        

    }
}
