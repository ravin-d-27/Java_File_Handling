import java.util.*;
import java.io.*;

public class dat_writer
{
    public static void main(String[] args) throws Exception
    {
        try
        {
            FileOutputStream writer = new FileOutputStream("testing_dat.dat");
            Scanner sc = new Scanner(System.in);

            System.out.println("Enter the message to write into the dat file: ");
            String message = sc.nextLine();

            byte[] arr = message.getBytes();

            writer.write(arr);

            System.out.println("The Message has been successfully written in the dat file");

            sc.close();
            writer.close();
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
    }   
}
