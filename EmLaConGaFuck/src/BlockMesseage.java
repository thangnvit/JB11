import java.io.*;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * Created by DEV on 10/5/2016.
 */
public class BlockMesseage {
    public static boolean check;

    public static void main(String[] args) {
        BlockingQueue<String> queueRead = new LinkedBlockingQueue<>();
        BlockingQueue<String> queueErrorMsg = new LinkedBlockingQueue<>();
        File fileInput = new File("D:\\fuck.txt");
        new Thread(() -> {
            try {
                BufferedReader reader = new BufferedReader(new FileReader(fileInput));
                String s;
                while ((s = reader.readLine()) != null) {
                    queueRead.put(s);
                }
                queueRead.put("Exit");
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }).start();
        HandleMesseage handleMesseage = new HandleMesseage(queueRead,queueErrorMsg);
        handleMesseage.start();
            try {
                BufferedWriter writer = new BufferedWriter(new FileWriter("D:\\errorMsg.txt"));
                while (true) {
                    String s = queueErrorMsg.take();
                    if(s.equals("Exit")){
                        break;
                    }
                    writer.write(s+"\n");
                }
                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
    }
}
