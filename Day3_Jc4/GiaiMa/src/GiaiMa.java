import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by DEV on 9/5/2016.
 */
public class GiaiMa {
    public static void main(String[] args) {
        try {
            FileInputStream fileInputStream = new FileInputStream("example_encrypted.txt");
            FileOutputStream fileOutputStream = new FileOutputStream("giai_ma.txt");
            int c;
            while ((c = fileInputStream.read()) != -1){
                c-=5;
                fileOutputStream.write(c);
            }
            fileInputStream.close();
            fileOutputStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
