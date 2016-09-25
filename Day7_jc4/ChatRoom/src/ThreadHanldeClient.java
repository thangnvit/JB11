import java.io.*;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by DEV on 9/25/2016.
 */
public class ThreadHanldeClient extends Thread {
    private Socket socket;
    private List<Socket> socketList;

    public ThreadHanldeClient(Socket socket, List<Socket> socketList) {
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
            e.printStackTrace();
        }
    }
}
