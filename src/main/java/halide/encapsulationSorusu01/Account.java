package halide.encapsulationSorusu01;

import java.util.Scanner;

public class Account {// 1- bir Account sınıfı oluşturunuz, fieldları accountNumber ve balance (bakiye).
    // 2- bir consructor ekleyiniz.
    // 3- Account sınıfına deposit (ParaEkle) metodu ekleyiniz.
    // 4- Account sınıfına withdraw (ParaÇıkar) metodu ekleyiniz.
    // 5- withdraw de 5000 inin üzerine Günlük limiti aştınız uyarısı verelim
    // 6- main metodunda  account oluşturarak ihtimalleri deneyiniz.
    //yapilacaklar: banka olusturma "the last codebander bank"
    //1.uye girisi yapiniz degilseniz uye olunuz
    //uye degilse uye formu olusturma
    //uyeyse ana ekrana gecer// para yukleme =para cekme=hesap goruntuleme
    // para varsa para cekecek
    public Account(){
    }
    int accountNumber;
    static int bakiye=0;
    static int limit=0;
    public static int paraEKle(int maas){
        bakiye+=maas;
        System.out.println("yatirmak istediginiz miktar hesabiniza yatirilmistir toplam tutar : "+ bakiye);
        return bakiye;
    }
    public static int paraCikar(int giderler){
        limit+=giderler;
        if (limit>0 && limit<5000){
            bakiye-=giderler;
            System.out.println("cekmek istediginiz miktar hesabinizdan cekilmistir geri kalan toplam tutar : "+ bakiye);
            System.out.println("gunluk cektiginiz toplam tutar : "+ giderler+" bugun icerisinde "+ (5000-limit)+" euro daha para cekebilirsiniz ");
        }else {
            System.out.println("gunluk limiti astiniz! \n en fazla 5000 Euro cekebilirsiniz");
            System.out.println("lutfen 5000 Eurodan daha az bir limit cekiniz");
        }
        return  bakiye;
    }
    public static void krediKartiKullanma(int kkk){
        bakiye-=kkk;
        limit+=kkk;
        if (limit>0 &&limit<5000){
            bakiye-=kkk;
            System.out.println("cekmek istediginiz miktar hesabinizdan cekilmistir geri kalan toplam tutar : "+ bakiye);
            System.out.println("gunluk cektiginiz toplam tutar : "+ kkk+" bugun icerisinde "+ (5000-limit)+" euro daha para cekebilirsiniz ");
        }else {
            System.out.println("gunluk limiti astiniz! \n en fazla 5000 Euro cekebilirsiniz");
            System.out.println("lutfen 5000 Eurodan daha az bir limit cekiniz");
        }
    }
    public  static void accountNumber(String accountNumber){
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen hesap numarinizi giriniz ");
        int hesapNo= scan.nextInt();
        if (hesapNo>1 && hesapNo<100){
            System.out.println("hesabiniz sistemimizde kayitlidir");
        }else {
            System.out.println("hatali bir hesap numarasi girdiniz! \n lutfen tekrar deneyiniz");
        }
    }
}
