package halide.personalproje;

import java.util.Map;
import java.util.Scanner;

public class Metot extends Tanimlar{ private Scanner scan = new Scanner(System.in);
    int sirano=1;

    public void selectOption() {
        System.out.println("Personel Bilgi Sayfasina Hosgeldiniz..");
        do {
            System.out.println("Hangi Islemi yapmak istiyorsunuz?\n1 :Yeni Kayit 2 :Kayit Gorme 3 :Kayit Silme 4 :Exit");
            int secenek=scan.nextInt();
            switch (secenek){
                case 1: kayitYap();
                    break;
                case 2: kayitGorme();
                    break;
                case 3: kayitSilme();
                    break;
                case 4:
                    System.out.println("gule gule...");
                    setFlag(false);
                    break;
                default:
                    System.out.println("Gecersiz secim yaptiniz");
            }

        } while (isFlag());
    }
    int counter=0;
    private void kayitSilme() {
        System.out.println("Silmek istediginiz kisinin Id numarasini giriniz");
        String yeniid=scan.next();
        if (getListe().containsKey(yeniid)){
            getListe().remove(yeniid);
            listeYap();
        }else {
            System.out.println("Bu Id ye sahip bir kullanici bulunmamaktadir");
            counter++;
            if(counter==3){
                System.out.println("ustu uste 3 defa hatali girdiniz gule gule...");
                selectOption();
            }else{
                kayitSilme();}
        }

    }



    private void kayitGorme() {
        System.out.println("Gormek istediginiz kisinin Id numarasini giriniz");
        String yeniid=scan.next();
        if (getListe().containsKey(yeniid)){
            System.out.println(getListe().get(yeniid).getName()+" "+getListe().get(yeniid).getAdres()
                    +" "+getListe().get(yeniid).getTelno());

        }else {System.out.println("Bu Id ye sahip bir kullanici bulunmamaktadir");
            kayitGorme();}
    }

    private void kayitYap() {
        System.out.println("Kayit sayfasina Hosgeldiniz");
        System.out.println("Id numaranizi giriniz");
        setId(scan.next());
        if(!getListe().containsKey(getId())){
            System.out.println("Adinizi yaziniz");
            String ad= scan.next();
            System.out.println("soyadinizi giriniz");
            String soyad=scan.next();
            setName(ad+" "+soyad);
            System.out.println("telefon numaranizi giriniz");
            String telno=scan.next();
            System.out.println("yasadiginiz sehri girin");
            setAdres(scan.next());
            getListe().put(getId(),new Tanimlar(getName(),getAdres(),telno));
            sirano++;
            listeYap();
        }else System.out.println("Zaten bu id dha once kullanilmis");
    }
    public void listeYap() {

        System.out.println("--------------------------Personel Listesi----------------------------");
        System.out.println("Sira No\t\tAd-Soyad\t\t\tAdres\t\t\t\tTelno");
        System.out.println("----------------------------------------------------------------------");
        for (Map.Entry<String, Tanimlar> w : getListe().entrySet()) {
            System.out.println(sirano + "\t\t\t" + w.getValue().getName()+"\t\t"+w.getValue().getAdres()+"\t\t\t\t"+w.getValue().getTelno());
        }
    }
}
