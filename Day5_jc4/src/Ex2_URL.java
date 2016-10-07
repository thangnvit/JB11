import java.io.*;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;

/**
 * Created by DEV on 9/12/2016.
 */
public class Ex2_URL {
    public static void main(String[] args) {
        float tmax, tmin, rain;
        int mm,year;

        try {
            URL url = new URL("http://www.metoffice.gov.uk/pub/data/weather/uk/climate/stationdata/durhamdata.txt");
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(url.openStream()));
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("file.txt"));
            String readLine;
            for (int i = 0; i < 7; i++) {
                bufferedReader.readLine();
            }
            String[] s =  bufferedReader.readLine().split(" ");
            for (String s1 : s) {
                if(s1.equals("")){
                }
            }
            while ((readLine = bufferedReader.readLine()) != null) {
//                String[] s = readLine.split("\t");


            }
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {


        }
    }
}
