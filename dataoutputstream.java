import java.io.*;

public class dataoutputstream extends Exception
{
    public static void main(String[] args)
    {
        try
        {
            FileOutputStream writer = new FileOutputStream("file.txt");
            DataOutputStream dos = new DataOutputStream(writer);

            dos.writeInt(31);
            dos.writeChar('S');
            dos.writeDouble(31.43);
            dos.flush();

            dos.close();
            writer.close();

            System.out.println("Done");
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
        
    }
}
