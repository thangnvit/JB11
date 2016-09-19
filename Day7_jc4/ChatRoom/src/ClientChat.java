import java.io.*;
import java.net.Socket;

/**
 * Created by DEV on 9/19/2016.
 */
public class ClientChat{
    private String serverName;
    private int port;
    private Chater chater;

    public ClientChat(String serverName, int port) {
        this.serverName = serverName;
        this.port = port;
    }

    public Chater getChater() {
        return chater;
    }

    public void setChater(Chater chater) {
        this.chater = chater;
    }

    public String getServerName() {
        return serverName;
    }

    public void setServerName(String serverName) {
        this.serverName = serverName;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public void startClient(){
        try {
            Socket socket = new Socket(serverName,port);
            ObjectOutputStream output = new ObjectOutputStream(socket.getOutputStream());
            output.writeObject(chater);
            ObjectInputStream input = new ObjectInputStream(socket.getInputStream());
            System.out.println(input.readUTF());
            output.flush();
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        ClientChat clientChat = new ClientChat("localhost",8000);
        Chater chater = new Chater("nam","litbe");
        clientChat.setChater(chater);
        clientChat.startClient();

    }
}
