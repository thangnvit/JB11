import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketException;

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
        System.out.println("Server is listening");
        try {
            ServerSocket serverSocket = new ServerSocket(port);
            while (true) {
                Socket socket = serverSocket.accept();
                System.out.println("Connected");
                DataInputStream input = new DataInputStream(socket.getInputStream());
                DataOutputStream output = new DataOutputStream(socket.getOutputStream());
                String nameFile = input.readUTF();
                if(!checkNameFile(nameFile)){
                    output.writeUTF("true");
                    output.flush();
                    File file = new File("D:\\test\\" + nameFile);
                    BufferedOutputStream writter = new BufferedOutputStream(new FileOutputStream(file));
                    byte[] buffer = new byte[1024];
                    while (input.read(buffer) != -1){
                        writter.write(buffer);
                        System.out.println("F");
                    }
                    System.out.println("f");
                    writter.flush();
                    writter.close();
                    BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
                    bufferedWriter.write(file.getPath());
                    bufferedWriter.newLine();
                    bufferedWriter.close();
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Server server = new Server(6969);
        server.startServer();
    }

    public static boolean checkNameFile(String nameFile) {
        String[] check = {"\\", "\"", ":", "*", "?", ">", "<", "/", "|"};
        for (String s : check) {
            if (nameFile.contains(s))
                return true;
        }
        return false;
    }
}
