import com.sun.org.apache.xpath.internal.SourceTree;
import jdk.nashorn.internal.ir.WhileNode;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketException;
import java.sql.Time;
import java.util.Scanner;
import java.util.Timer;

/**
 * Created by DEV on 9/19/2016.
 */
public class ClientChat {
    private String serverName;
    private int port;
    private String nickName, text;
    private Socket socket;
    private Scanner scan = new Scanner(System.in);

    public ClientChat(String serverName, int port, String nickName) {
        this.serverName = serverName;
        this.nickName = nickName;
        this.port = port;
        try {
            socket = new Socket(serverName, port);
        } catch (IOException e) {
            e.printStackTrace();
        }
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

    public void startClient() {
        new Thread(() -> {
            while (true) {
                text = scan.nextLine();
                sendData(text);
            }
        }).start();
        new Thread(() -> {
            while (true) {
                try {
                    receiveData();
                } catch (InterruptedIOException e) {
                    e.printStackTrace();
                    return;
                }
            }
        }).start();
    }

    public void sendData(String text) {
        try {
            BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
            writer.write(nickName + ":" + text);
            writer.newLine();
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String receiveData() throws InterruptedIOException {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            System.out.println(reader.readLine());
        } catch (SocketException e) {
            throw new InterruptedIOException("Server Error!");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String nickname;
        System.out.println("nick name:");
        nickname = scan.nextLine();
        ClientChat clientChat = new ClientChat("localhost", 8000, nickname);
        clientChat.startClient();
    }
}
