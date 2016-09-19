import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

/**
 * Created by DEV on 9/19/2016.
 */
public class Client {
    private int port;
    private String serverName;
    private double radius;
    private double area;

    public Client(String serverName, int port) {
        this.serverName = serverName;
        this.port = port;
    }

    public double getArea() {
        return area;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public String getServerName() {
        return serverName;
    }

    public void setServerName(String serverName) {
        this.serverName = serverName;
    }

    public Client(int port, String serverName) {
        this.port = port;
        this.serverName = serverName;

    }

    public void startClient() {

        try {
            Socket socket = new Socket(serverName, port);
            DataInputStream input = new DataInputStream(socket.getInputStream());
            DataOutputStream output = new DataOutputStream(socket.getOutputStream());
            output.writeDouble(radius);
            output.flush();
            area = input.readDouble();
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double radius,area;
        Client clientProgram = new Client("localhost",8000);
        System.out.println("Radius is ");
        radius = scan.nextDouble();
        clientProgram.setRadius(radius);
        clientProgram.startClient();
        System.out.println("Area is: "+ clientProgram.getArea());
    }
}
