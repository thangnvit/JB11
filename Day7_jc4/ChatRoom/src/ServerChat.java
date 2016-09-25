import com.sun.org.apache.xpath.internal.SourceTree;
import com.sun.xml.internal.stream.Entity;
import com.sun.xml.internal.stream.util.ThreadLocalBufferAllocator;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by DEV on 9/19/2016.
 */
public class ServerChat {
    private int port;
    private List<Socket> socketList = new ArrayList<>();
    private ServerSocket serverSocket;

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public ServerChat(int port) {
        this.port = port;
        try {
            serverSocket = new ServerSocket(port);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void startServer() {
        new Thread(()->{
            while (true) {
                try {
                    Socket socket = serverSocket.accept();
                    System.out.println("Connected");
                    socketList.add(socket);
                    new ThreadHanldeClient(socket,socketList).start();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }).start();
    }


    public static void main(String[] args) {
        ServerChat serverChat = new ServerChat(8000);
        serverChat.startServer();
    }
}
