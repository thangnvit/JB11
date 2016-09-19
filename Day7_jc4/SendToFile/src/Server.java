import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by DEV on 9/19/2016.
 */
public class Server {
    private int port;

    public Server(int port) {
        this.port = port;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public void startServer() {
        try {
            System.out.println("Server is listening...");
            ServerSocket server = new ServerSocket(port);
            while (true) {
                Socket socket = server.accept();
                System.out.println("Connected");
                DataInputStream input = new DataInputStream(socket.getInputStream());
                String nameFile = input.readUTF();
                File file = new File("D:\\test\\" + nameFile);
                BufferedOutputStream writter = new BufferedOutputStream(new FileOutputStream(file));
                byte[] buffer = new byte[1024];
                while (input.read(buffer) != -1) {
                    writter.write(buffer);
                }
                System.out.println("Ok");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Server server = new Server(8000);
        server.startServer();
    }
}
