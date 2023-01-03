import java.net.*;
import java.io.*;
import java.util.*;

public class DataInputSteamclass 
{
    public static void main(String[] args) 
    {
        try
        {
            Socket ob = new Socket("localhost",8450);
            System.out.println("Connected to server");   
            String da=" ";

           while(!da.equals("stop"))           
           {      
                Scanner rd = new Scanner(ob.getInputStream());           
                String st = rd.nextLine();
                System.out.println(st);

                Scanner sc1 = new Scanner(System.in);
                da = sc1.nextLine();
                PrintStream ps1 = new PrintStream(ob.getOutputStream());
                ps1.println(da);
              
           }
           
        }   
        catch (Exception e)
        {
            System.out.println(e);
        } 
    }
}

