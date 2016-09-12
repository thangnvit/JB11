import org.thangnv.tramdubaothoitiet.TramThoiTiet;
import org.thangnv.trungtamdubao.TrungTamDuBao;

/**
 * Created by DEV on 8/8/2016.
 */
public class Main {
    public static void main(String[] args) {
        TramThoiTiet HaNoi = new TramThoiTiet(false,"HaNoi");
        TrungTamDuBao VietNam = new TrungTamDuBao(HaNoi);
        HaNoi.changeMua(true);
    }
}
