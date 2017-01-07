import java.io.*;
import java.net.*;

public class Service implements Runnable 
{
private	byte Buffer[]=new byte[50];
private Socket client;
	Service(byte B[],Socket client)
	{
		this.Buffer=B;
		this.client=client;
	}
	public void run() 
	{
		if((char)Buffer[0]!='\0')
		{
			String message="Message Received";
			byte B2[]=message.getBytes();
			try{
				OutputStream OS=client.getOutputStream();
				OS.write(B2);
			}catch(IOException IOe){}
		}
		
	}

	

}
