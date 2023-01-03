import java.net.*;
import java.io.*;
import java.util.*;

public class ClientEvenodd
{
    public static void main(String[] args) 
    {
        try
        {
            Socket ob = new Socket("localhost",8450);
            System.out.println("Connected to server");   
            

           while(true)           
           {      
                Scanner rd = new Scanner(ob.getInputStream());           
                String st = rd.nextLine();
                System.out.println(st);

                Scanner sc1 = new Scanner(System.in);
                int da = sc1.nextInt();
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
