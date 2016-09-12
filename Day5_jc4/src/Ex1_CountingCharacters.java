import java.io.*;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by DEV on 9/11/2016.
 */
public class Ex1_CountingCharacters {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String path;
//        path = scan.nextLine();
//        File file = new File(path);
        File file = new File("E:\\Vforum.dat");
        try {
            FileReader fileReader = new FileReader(file);
            Map<Character,Integer> hashMap = new LinkedHashMap<>();
            int c;
            while ((c =fileReader.read()) != -1){
                if(!hashMap.containsKey((char) c)){
                    hashMap.put((char) c,1);
                }else{
                    int value = hashMap.get((char) c);
                    value++;
                    hashMap.put((char) c,value);
                }
            }
            System.out.println(hashMap);
            fileReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
