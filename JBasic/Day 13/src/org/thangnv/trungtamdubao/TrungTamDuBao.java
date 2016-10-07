package org.thangnv.trungtamdubao;

import org.thangnv.tramdubaothoitiet.TramThoiTiet;

/**
 * Created by DEV on 8/8/2016.
 */
public class TrungTamDuBao{

    private TramThoiTiet tramThoiTiets = new TramThoiTiet();

    public TrungTamDuBao() {
    }

    public TrungTamDuBao(TramThoiTiet tramThoiTiets) {
        this.tramThoiTiets = tramThoiTiets;
    }


    public void setTramThoiTiets(String ten,boolean mua) {
        tramThoiTiets.setMua(mua);
        tramThoiTiets.setTen(ten);
    }

}
