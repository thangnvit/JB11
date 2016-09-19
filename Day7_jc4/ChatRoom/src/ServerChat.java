import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by DEV on 9/19/2016.
 */
public class ServerChat {
    private int port;
    private List<Socket> socketList = new ArrayList<>();

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public ServerChat(int port) {

        this.port = port;
    }

    public void startServer() {
        try {
            System.out.println("Server is listening....");
            ServerSocket serverSocket = new ServerSocket(port);
            while (true) {
                Socket socket = serverSocket.accept();
                System.out.println("Connected");
                socketList.add(socket);
                ObjectInputStream input = new ObjectInputStream(socket.getInputStream());
                Object chater = input.readObject();
                for (Socket socket1 : socketList) {
                    ObjectOutputStream output = new ObjectOutputStream(socket1.getOutputStream());
                    output.writeUTF(chater.toString()+"\n");
                    output.flush();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        ServerChat serverChat = new ServerChat(8000);
        serverChat.startServer();
    }
}
