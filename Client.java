import java.net.*;
import java.io.*;

public class Client 
{
    public static void main(String[] args) 
    {
        try
        {
            Socket ob = new Socket("localhost",8450);
            System.out.println("Connected to server");
           BufferedReader rd = new BufferedReader(new InputStreamReader(ob.getInputStream()));
           String st = rd.readLine();
           System.out.println(st);
           ob.close();
        }   
        catch (Exception e)
        {
            System.out.println(e);
        } 
    }
}
