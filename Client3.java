import java.net.*;
import java.io.*;

public class Client3 
{
    public static void main(String[] args) 
    {
        try
        {
            Socket ob = new Socket("10.68.98.201",8080);
            System.out.println("Connected to server");
            while(true)
            {
            }
            
        }   
        catch (Exception e)
        {
            System.out.println(e);
        } 
    }
}

