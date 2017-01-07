import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
 
public class Server3 extends Thread
{
	ServerSocket ss;
    Socket socket;
    
   public Server3(ServerSocket sock)
   {
	   this.ss=sock;
   }
	   
   public void run()
   {
        try
        {
            while(true)
            {
                //Reading the message from the client
                socket = ss.accept();
                Thread.sleep(5000);
                InputStream is = socket.getInputStream();
                InputStreamReader isr = new InputStreamReader(is);
                BufferedReader br = new BufferedReader(isr);
                String message = br.readLine();
                System.out.println("Message received from client is "+message);
 
                //Multiplying the number by 2 and forming the return message
 
                //Sending the response back to the client.
                OutputStream os = socket.getOutputStream();
                PrintStream PS=new PrintStream(os);
                PS.println("Server got your message");
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        finally
        {
            try
            {
                socket.close();
            }
            catch(Exception e){}
        }
    }
}