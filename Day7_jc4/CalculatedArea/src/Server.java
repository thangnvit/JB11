import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by DEV on 9/19/2016.
 */
public class Server {
    private int port;
    private double radius;

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public Server(int port) {
        this.port = port;
    }

    public void startSever() {

        try {
            System.out.println("Server is listening....");
            ServerSocket serverSocket = new ServerSocket(port);
            while (true) {
                Socket socket = serverSocket.accept();
                System.out.println("Connected");
                DataInputStream input = new DataInputStream(socket.getInputStream());
                DataOutputStream output = new DataOutputStream(socket.getOutputStream());
                radius = input.readDouble();
                output.writeDouble(getArea(radius));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public double getArea(double radius) {
        return radius * radius * Math.PI;
    }

    public static void main(String[] args) {
        Server server = new Server(8000);
        server.startSever();
    }
}
