import java.io.*;
import java.net.Socket;

/**
 * Created by DEV on 9/19/2016.
 */
public class Client {
    private String serverName;
    private int port;
    private File file;

    public Client(String serverName, int port) {
        this.serverName = serverName;
        this.port = port;
    }

    public String getServerName() {
        return serverName;
    }

    public void setServerName(String serverName) {
        this.serverName = serverName;
    }

    public void setFile(File file) {
        this.file = file;
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
            DataOutputStream output = new DataOutputStream(socket.getOutputStream());
            BufferedInputStream reader = new BufferedInputStream(new FileInputStream(file));
            output.writeUTF(file.getName());
            byte[] buffer = new byte[1024];
            while (reader.read(buffer) !=-1 ){
                output.write(buffer);
            }
            output.flush();
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Client client = new Client("localhost",8000);
        File file = new File("D:\\SAVE\\music\\Yeu Voi Vang - Le Bao Binh.mp3");
        client.setFile(file);
        client.startClient();
    }
}
