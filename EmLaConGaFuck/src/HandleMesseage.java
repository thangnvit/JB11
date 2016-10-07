import java.util.concurrent.BlockingQueue;

/**
 * Created by DEV on 10/6/2016.
 */
public class HandleMesseage extends Thread {
        private BlockingQueue<String> queuRead;
        private BlockingQueue<String> queuWrite;

        public HandleMesseage(BlockingQueue<String> queuRead, BlockingQueue<String> queuWrite) {
            this.queuRead = queuRead;
            this.queuWrite = queuWrite;
        }

        @Override
        public void run() {
            try {
                while (true) {
                    String s = queuRead.take();
                    if (s.equals("Exit")) {
                        queuRead.put("Exit");
                        queuWrite.put("Exit");
                        break;
                    }
                    if(!(s.startsWith("84") || s.startsWith("084")) || s.contains("fuck")){
                        queuWrite.put(s);
                    }
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
