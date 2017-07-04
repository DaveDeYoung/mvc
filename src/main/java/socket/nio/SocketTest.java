package socket.nio;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.util.Iterator;
import java.util.Set;

public class SocketTest {
	
	public static void main(String[] args) throws IOException {
		ByteBuffer buffer = ByteBuffer.allocate(1024);
		Selector selector = Selector.open();
		ServerSocketChannel serverSocketChannel = ServerSocketChannel.open();
		serverSocketChannel.configureBlocking(false);
		serverSocketChannel.socket().bind(new InetSocketAddress(8080));
		serverSocketChannel.register(selector, SelectionKey.OP_ACCEPT);
		while(true){
			 if (selector.select(3000) == 0) {// 监听注册通道，当其中有注册的 IO  
                 // 操作可以进行时，该函数返回，并将对应的  
                 // SelectionKey 加入 selected-key  
                 // set  
			System.out.print("独自等待.");  
			continue;  
			}
			Set<SelectionKey> selectedKeys = selector.selectedKeys();
			Iterator<SelectionKey> it = selectedKeys.iterator();
			while(it.hasNext()){
				SelectionKey key = it.next();
				if((key.readyOps()&SelectionKey.OP_ACCEPT)==SelectionKey.OP_ACCEPT){
					ServerSocketChannel ssChannel = (ServerSocketChannel) key.channel();
					SocketChannel sc = ssChannel.accept();
					sc.configureBlocking(false);
					sc.register(selector, SelectionKey.OP_READ);
					it.remove();
				}else if((key.readyOps()&SelectionKey.OP_READ)==SelectionKey.OP_READ){
					SocketChannel sc = (SocketChannel) key.channel();
					while(true){
						buffer.clear();
						int n = sc.read(buffer);
						System.out.println(n);
						if(n<0){
							break;
						}
						buffer.flip();
					}
					it.remove();
				}
			}
		}
	}

}
