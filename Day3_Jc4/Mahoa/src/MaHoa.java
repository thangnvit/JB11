import java.io.*;

/**
 * Created by DEV on 9/5/2016.
 */
public class MaHoa {
    public static void main(String[] args) {
        File file = new File("example.txt");
        try {
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            FileOutputStream fileOutputStream = new FileOutputStream("example_encrypted.txt");
            int c;
            while((c = fileInputStream.read()) != -1){
                c+=5;
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
