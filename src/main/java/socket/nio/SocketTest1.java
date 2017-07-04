package socket.nio;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class SocketTest1 {
	
	public static void main(String[] args) throws UnknownHostException, IOException {
		Socket socket = new Socket("127.0.0.1", 8080);
		OutputStream out = socket.getOutputStream();
		out.write(1);
		out.flush();
		socket.close();
		System.out.println(1);
	}

}
