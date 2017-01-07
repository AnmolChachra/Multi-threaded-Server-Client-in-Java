import java.util.concurrent.*;


import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
public class MultiThreadedServer {

	public static void main(String[] args) throws Exception{
	
		ServerSocket sock=new ServerSocket(20000);
		System.out.println("Server Started and listening to the port 21000");
		ExecutorService ES=Executors.newFixedThreadPool(3);	
		Server3 s1=new Server3(sock);
		ES.execute(s1);
	}

}
