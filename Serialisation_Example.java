import java.io.*;

public class Serialisation_Example 
{
    public static void main(String[] args) throws Exception
    {
        try
        {
            Student s1 = new Student(1000, "ABCD");
            FileOutputStream writer = new FileOutputStream("ser_text.txt");
            ObjectOutputStream obj = new ObjectOutputStream(writer);

            obj.writeObject(s1);
            obj.flush();

            System.out.println("The Object has been written successfully!");

            obj.close();
            writer.close();
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
    
}
