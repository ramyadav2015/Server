import java.net.*;
import java.util.*;
import javax.xml.transform.Source;

import java.io.*;

public class ServerEvenodd 
{
    
    public static void main(String[] args) 
    {
        try
        {
            
            ServerSocket obj = new ServerSocket(8450);
            System.out.println("Server is running....");
            Socket ss = obj.accept();
            System.out.println("connection Established");
            

            while(true)
            {  
                PrintStream ps = new PrintStream(ss.getOutputStream());
                Scanner sc = new Scanner(System.in);
                String data = sc.nextLine();
                ps.println(data);

               Scanner rd = new Scanner(ss.getInputStream()); 
               int sm = rd.nextInt();
               if(sm%2==0)
               {
                    System.out.println("Enter num is sum ");
               }
               else
               {
                System.out.println("Enter num is odd ");
               }              
                

                
            }
            
        }   
        catch (Exception e)
        {
            System.out.println(e);
        } 
    }
}
