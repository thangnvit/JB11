import java.io.*;

/**
 * Created by DEV on 9/1/2016.
 */
public class FileSplitter {
    private String sourceFile;

    public FileSplitter(String sourceFile) {
        this.sourceFile = sourceFile;
    }
    public boolean fileSpitter(int numberOfPieces) {
        File file = new File(sourceFile);
        long sourceSize = file.length();
        long bytesPerSplitter = sourceSize / (numberOfPieces);
        byte[] buffer = new byte[(int)bytesPerSplitter];
        try {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(sourceFile));
            int i =1;
            while(bufferedInputStream.read(buffer) != -1 && i<=numberOfPieces){
                File newFile = new File(file.getParent(),file.getName() + i);
                BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(newFile));
                bufferedOutputStream.write(buffer);
                bufferedOutputStream.close();
                i++;
            }
            bufferedInputStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return  true;
    }


}
