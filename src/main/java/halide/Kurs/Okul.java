package halide.Kurs;

import java.util.ArrayList;

public class Okul {
    private String okulAd;
    private int maxOgrenciSayisi;
    private ArrayList<Ogrenci>ogrenciler= new ArrayList<>();
    public Okul(String okulAd,int maxOgrenciSayisi){
        setOkulAd(okulAd);
        setMaxOgrenciSayisi(maxOgrenciSayisi);
    }

    public String getOkulAd() {
        return okulAd;
    }

    public int getMaxOgrenciSayisi() {
        return maxOgrenciSayisi;
    }

    public ArrayList<Ogrenci> getOgrenciler() {
        return ogrenciler;
    }

    public void setOkulAd(String okulAd) {
        this.okulAd = okulAd;
    }

    public void setMaxOgrenciSayisi(int maxOgrenciSayisi) {
        this.maxOgrenciSayisi = maxOgrenciSayisi;
    }


}
