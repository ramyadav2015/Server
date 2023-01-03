import java.net.*;
import java.util.*;
import java.io.*;

public class DataInOutStreamclass 
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
               String sm = rd.nextLine();              
                System.out.println(sm);

                
            }
            
        }   
        catch (Exception e)
        {
            System.out.println(e);
        }     
    }    
}
