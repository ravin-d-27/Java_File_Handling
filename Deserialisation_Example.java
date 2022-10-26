import java.io.*;

public class Deserialisation_Example 
{
    public static void main(String[] args) throws Exception
    {
        try
        {
            ObjectInputStream reader = new ObjectInputStream(new FileInputStream("ser_text.txt"));
            Student s = (Student)reader.readObject();

            System.out.println("The name of the Student is: "+s.name);
            System.out.println("The ID of the Student is: "+s.id);
            
            reader.close();
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
        
    }    
}
