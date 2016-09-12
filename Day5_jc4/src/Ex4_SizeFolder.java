import javax.naming.spi.DirectoryManager;
import java.io.File;
import java.util.*;

/**
 * Created by DEV on 9/12/2016.
 */
public class Ex4_SizeFolder {
    public static void main(String[] args) {
        File file = new File("E:\\SAVE");
        Queue<File> queue = new LinkedList<>();

        System.out.println(getSize(queue, file));
    }
    public static long getSize(Queue<File> queue, File path) {
        File file;
        queue.addAll(Arrays.asList(path.listFiles()));
        long size = 0;
        while ((file = queue.poll()) != null) {
            if (file.isFile()) {
                size += file.length();
                continue;
            } else {
                queue.addAll(Arrays.asList(file.listFiles()));
            }
        }
        return size;
    }
}




