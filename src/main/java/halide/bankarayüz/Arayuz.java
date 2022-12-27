package halide.bankarayüz;

import java.util.Scanner;

public class Arayuz {
    Scanner scanner=new Scanner(System.in);
    public void anasayfa() {
        System.out.println("Hosgeldiniz..\nLutfen size uygun olan secimi yapiniz\n1: Personel Girisi\n2: Musteri Girisi\n3: Cikis");
        String secim=scanner.next();
        while(!(secim.equals("1")||secim.equals("2")||secim.equals("3"))){
            System.out.println("gecerli bir secim yapiniz");
            secim=scanner.next();
        }
        if(secim.equals("1")){
            Personel personel=new Personel();
            personel.personelIslemleri();
        }else if(secim.equals("2")){
            Musteriler musteriler=new Musteriler();
            musteriler.musteriIslemleri();

        }
}}
