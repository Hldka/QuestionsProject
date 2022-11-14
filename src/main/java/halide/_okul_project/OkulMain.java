package halide._okul_project;

import java.util.ArrayList;
import java.util.Scanner;

public class OkulMain {
    public static void main(String[] args) {
        Okul okul1=new Okul("Kabatas Lisesi",3);
        ArrayList<Ogrenci>okulunOgrenciler=okul1.getOgrenciler();

        //burada okul1 olusturulurken olusan ArrayList get methodu ile alindi


        int ogrenciSayisi=1;
        Scanner oku=new Scanner(System.in);
        Scanner okuInt=new Scanner(System.in);
        do {
            System.out.println(ogrenciSayisi+".Ögrencinin Adi=");
            String ogrAd=oku.nextLine();

            System.out.println(ogrenciSayisi+".Ögrencinin Soyadi=");
            String ogrSoyad=oku.nextLine();

            System.out.println(ogrenciSayisi+".Ögrencinin Yasi=");
            int yas=okuInt.nextInt();
            try {
                Ogrenci ogr=new Ogrenci(ogrAd,ogrSoyad,yas);
                //Okul1.getOgrenciler().add(ogr);
                okulunOgrenciler.add(ogr);//ArrayListe ögrenci eklendi
                ogrenciSayisi++;
            }catch (Exception ex){
                System.out.println(ex.getMessage());
                System.out.println("Yeni Ögrenci giriniz");
            }
        }while (ogrenciSayisi<= okul1.getMaxOgrenciSayisi());


        for (Ogrenci ogr :okul1.getOgrenciler()){
            System.out.println("ogr="+ogr);
        }










    }



}
