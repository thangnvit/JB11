import javax.management.relation.RoleUnresolved;
import java.io.*;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by DEV on 9/25/2016.
 */
public class ClientHanlde extends Thread {
    private Socket socket;
    private List<Socket> socketList;

    public ClientHanlde(Socket socket, List<Socket> socketList) {
        this.socket = socket;
        this.socketList = socketList;
    }

    @Override
    public void run() {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            while (true) {
                String data = reader.readLine();
                for (Socket socket1 : socketList) {
                    BufferedWriter writter = new BufferedWriter(new OutputStreamWriter(socket1.getOutputStream()));
                    writter.write(data);
                    writter.newLine();
                    writter.flush();
                }
            }
        } catch (IOException e) {
            try {
                System.out.println("A socket disconnect");
                socketList.remove(socket);
                socket.close();
            } catch (IOException e1) {
                e.printStackTrace();
            }
        }
    }
}
