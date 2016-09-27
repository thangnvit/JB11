package org.thangnv.tramdubaothoitiet;

import org.thangnv.trungtamdubao.TrungTamDuBao;

/**
 * Created by DEV on 8/8/2016.
 */
public  class TramThoiTiet {
    protected boolean  mua;
    protected String ten;
    protected TrungTamDuBao trungTamDuBao;
    public TramThoiTiet() {
    }

    public TramThoiTiet(boolean mua, String ten) {
        this.mua = mua;
        this.ten = ten;
    }

    public void setMua(boolean mua) {
        this.mua = mua;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }
    public String changeMua(boolean Mua){
        this.mua = Mua;

        trungTamDuBao.setTramThoiTiets(this.ten,this.mua);
        return trungTamDuBao.toString();

    }

    public boolean isMua() {
        return mua;
    }

    public String getTen() {
        return ten;
    }

    @Override
    public String toString() {
        if(this.mua == true){
            return "Dang mua";
        }
        else return "ko Mua";
    }
}
