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
            throw new RuntimeException("Failed to connect to port 8000", e);
        }
    }

    public void startClient() {
        new receiveMesseage().start();
        try {
            BufferedWriter writter = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
            while (true) {
                text = scan.nextLine();
                writter.write(nickName + ":" + text);
                writter.newLine();
                writter.flush();
            }
        } catch (IOException e) {
            System.out.println("Failed to send Messeage!");
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("nick name:");
        String nickname = scan.nextLine();
        ClientChat clientChat = new ClientChat("localhost", 8000, nickname);
        clientChat.startClient();
    }

    public class receiveMesseage extends Thread {
        @Override
        public void run() {
            try {
                BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                while (true) {
                    System.out.println(reader.readLine());
                }
            } catch (IOException e) {
                System.out.println("Failed to receive Messeage!");
                e.printStackTrace();
            }
        }
    }
}
