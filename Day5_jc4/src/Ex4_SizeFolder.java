import javax.naming.spi.DirectoryManager;
import java.io.File;
import java.util.*;

/**
 * Created by DEV on 9/12/2016.
 */
public class Ex4_SizeFolder {
    public static void main(String[] args) {
        File file = new File("E:\\SAVE");
        File[] files = file.listFiles();

        Queue<File> fileQueue = new LinkedList<>();
        Queue<File> directoryQueue = new LinkedList<>();
        Queue<File> genericQueue = new LinkedList<>();
        genericQueue.addAll(Arrays.asList(files));
        genericStream(genericQueue,directoryQueue,fileQueue);
    }
    public static void genericStream(Queue<File> genericQueue,Queue<File> directoryQueue,Queue<File> fileQueue){
        while (genericQueue.size() > 0) {
            if (genericQueue.peek().isDirectory()) {
                directoryQueue.offer(genericQueue.poll());
            }else {
                fileQueue.offer(genericQueue.poll());
            }
        }
    }
    public static void fileInDrecotry(Queue<File> directoryQueue,Queue<File> genericQueue){
    }
}
//        for (File file1 : files) {
//            if (file1.isDirectory()) {
//                directoryQueue.offer(file1);
//            } else {
//                fileQueue.offer(file1);
//            }
//        }
//        System.out.println(fileInDrecotry(directoryQueue));
//        System.out.println(fileInDrecotry(directoryQueue));
//    }
//



