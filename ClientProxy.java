import java.net.*;
import java.io.*;


public class ClientProxy implements Runnable
{   Thread t;
	ClientProxy()
	{
		this.t=new Thread(this);
		t.run();
		
	}
	public void run()
	{	
	try{
		Socket S1=new Socket("127.0.0.1",1700);
	InputStreamReader IR1=new InputStreamReader(S1.getInputStream());
    BufferedReader Buf=new BufferedReader(IR1);
    String  message=Buf.readLine();
    System.out.println("S1:"+message);
    IR1.close();
	OutputStream OS=S1.getOutputStream();
     String text="Hello to the server from client 2	A";
     byte Buffer1[]=text.getBytes();
     OS.write(Buffer1);
     OS.close();
          S1.close();
	}catch(Exception e){}
	
	}
}
