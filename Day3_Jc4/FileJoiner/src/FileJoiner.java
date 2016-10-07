import java.io.*;

/**
 * Created by DEV on 9/5/2016.
 */
public class FileJoiner {
    private String listLink;

    public FileJoiner(String listLink) {
        this.listLink = listLink;
    }

    public boolean fileJoiner() {
        String[] link = listLink.split(",");
        int i = 0;
        File file = new File("FileVuaNoi");
        try {
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file));
            while (i != link.length) {
                BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(link[i]));
                byte[] buffer = new byte[link[i].length()/2];
                while (bufferedInputStream.read(buffer) !=-1){
                    bufferedOutputStream.write(buffer);

                }
                i++;
                bufferedInputStream.close();
            }
            bufferedOutputStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return true;
    }

    public static void main(String[] args) {
    //    FileJoiner fileJoiner = new FileJoiner("D:\\SAVE\\music\\AoEmChuaMacMotLan-TruongVu_k5_hq.mp31,D:\\SAVE\\music\\AoEmChuaMacMotLan-TruongVu_k5_hq.mp32,D:\\SAVE\\music\\AoEmChuaMacMotLan-TruongVu_k5_hq.mp33,D:\\SAVE\\music\\AoEmChuaMacMotLan-TruongVu_k5_hq.mp34,D:\\SAVE\\music\\AoEmChuaMacMotLan-TruongVu_k5_hq.mp35,D:\\SAVE\\music\\AoEmChuaMacMotLan-TruongVu_k5_hq.mp36,D:\\SAVE\\music\\AoEmChuaMacMotLan-TruongVu_k5_hq.mp37,D:\\SAVE\\music\\AoEmChuaMacMotLan-TruongVu_k5_hq.mp38,D:\\SAVE\\music\\AoEmChuaMacMotLan-TruongVu_k5_hq.mp39,D:\\SAVE\\music\\AoEmChuaMacMotLan-TruongVu_k5_hq.mp310");
       FileJoiner fileJoiner = new FileJoiner("D:\\SAVE\\img.jpg1,D:\\SAVE\\img.jpg2,D:\\SAVE\\img.jpg3,D:\\SAVE\\img.jpg4,D:\\SAVE\\img.jpg5,D:\\SAVE\\img.jpg6,D:\\SAVE\\img.jpg7,D:\\SAVE\\img.jpg8,D:\\SAVE\\img.jpg9,D:\\SAVE\\img.jpg10");
        fileJoiner.fileJoiner();
    }
}
