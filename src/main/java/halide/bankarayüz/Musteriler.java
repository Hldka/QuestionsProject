package halide.bankarayüz;

import java.util.Scanner;
//Müsteri : 1.)Bakiyesini görebilir.
//        2.)Para yatirabilir.
//        3.)Para cekebilir

public class Musteriler {
    Scanner scanner=new Scanner(System.in);
    public void musteriIslemleri() {
        Personel personel=new Personel();

        System.out.println("Musteri islemlerine Hosgeldiniz\nLütfen yapmak istediginiz islemi seciniz" +
                "\n1: Bakiye goruntule\n2: Para cek\n3: Para Yatir\n4: Ana Menu\n5: Cikis");
        String secim=scanner.next();
        while(!(secim.equals("1")||secim.equals("2")||secim.equals("3")||secim.equals("4")||secim.equals("5"))){
            System.out.println("gecerli bir secim yapiniz");
            secim=scanner.next();
        }

        System.out.println("lutfen adinizi girin");
        String name=scanner.next();
        switch (secim){

            case "1":

                System.out.println(personel.getListe().get(name));
                musteriIslemleri();
                break;
            case "2":
                System.out.println("Kac para cekmek istiyorsunuz");
                int paracek=scanner.nextInt();
                while (paracek<0||paracek>personel.getListe().get(name)){
                    System.out.println("Gecerli bir secim yapin");
                    paracek=scanner.nextInt();
                }
                int yeni=personel.getListe().get(name)-paracek;
                personel.getListe().put(name,yeni);
                System.out.println("yeni bakiyeniz "+personel.getListe().get(name));
                musteriIslemleri();
                break;
            case "3":

                System.out.println("Kac para yatirmak istiyorsunuz");
                int parayatir=scanner.nextInt();
                while (parayatir<0){
                    System.out.println("Gecerli bir secim yapin");
                    parayatir=scanner.nextInt();
                }
                int yeni1=personel.getListe().get(name)+parayatir;
                personel.getListe().put(name,yeni1);
                System.out.println("yeni bakiyeniz "+personel.getListe().get(name));
                musteriIslemleri();
                break;
            case "4":
                Arayuz arayuz=new Arayuz();
                arayuz.anasayfa();
                break;
            case "5":
                System.out.println("Gule gule");
                break;
        }
    }
}
