import java.net.*;
import java.util.*;
import javax.xml.transform.Source;

import java.io.*;

public class Server 
{
    
    public static void main(String[] args) 
    {
        try
        {
            Scanner sc = new Scanner(System.in);
            String data = sc.nextLine();
            ServerSocket obj = new ServerSocket(8450);
            while(true)
            {
                
                Socket ss = obj.accept();
                System.out.println("connection Established");
                PrintStream ps = new PrintStream(ss.getOutputStream());
                ps.print(data);
                ss.close();
            }
        }   
        catch (Exception e)
        {
            System.out.println(e);
        } 
    }
}
