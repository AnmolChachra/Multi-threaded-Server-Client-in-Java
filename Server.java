import java.net.*;
import java.io.*;

public class Server {

	public static void main(String[] args) throws Exception
	{
	   Server serv1=new Server();
	   serv1.run();
	}
	public	void run() throws Exception
	{
			ServerSocket ServSock1=new ServerSocket(25000);
		
		System.out.println("Server Started and listening to the port 1700");
		Socket S1=ServSock1.accept();
		InputStreamReader IR=new InputStreamReader(S1.getInputStream());
		BufferedReader Buf=new BufferedReader(IR);
		String message=Buf.readLine();
		System.out.println(message);
		PrintStream PS= new PrintStream(S1.getOutputStream());
		PS.print("Message Received");
		ServSock1.close();
		/*Thread thrd=new Thread(new Service(Buffer,Sock));
		thrd.start();
		try
		{
			thrd.join();
			
		}catch (InterruptedException ie){}*/
		
		
	}

}
