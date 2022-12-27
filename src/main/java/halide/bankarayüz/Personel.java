package halide.bankarayüz;

import java.util.HashMap;
import java.util.Scanner;

//Personel: a)Tüm müsterileri görebilir
//        b)Yeni müsteriler ekleyebilir.
//        c)Müsteri silebilir.
public class Personel {
    Scanner scanner=new Scanner(System.in);
    private static HashMap<String,Integer> liste=new HashMap<>();
    private static String name;
    private static int bakiye;

    public  HashMap<String, Integer> getListe() {
        return liste;
    }

    public void setListe(HashMap<String, Integer> liste) {
        this.liste = liste;
    }

    public static String getName() {
        return name;
    }

    public static void setName(String name) {
        Personel.name = name;
    }

    public static int getBakiye() {
        return bakiye;
    }

    public static void setBakiye(int bakiye) {
        Personel.bakiye = bakiye;
    }

    public void personelIslemleri() {
        System.out.println("Personel islemlerine Hosgeldiniz\nLütfen yapmak istediginiz islemi seciniz" +
                "\n1: Musterileri listele\n2: Musteri ekle\n3: Musteri sil\n4: Ana Menu\n5: Cikis");
        String secim=scanner.next();
        while(!(secim.equals("1")||secim.equals("2")||secim.equals("3")||secim.equals("4")||secim.equals("5"))){
            System.out.println("gecerli bir secim yapiniz");
            secim=scanner.next();
        }
        switch (secim){
            case "1":
                System.out.println(liste);
                personelIslemleri();
                break;
            case "2":
                System.out.println("Musterinin adini girin");
                name=scanner.next();
                System.out.println("bakiye girin");
                bakiye=scanner.nextInt();
                liste.put(name,bakiye);
                personelIslemleri();
                break;
            case "3":
                System.out.println("Musterinin adini girin");
                name=scanner.next();
                while (!liste.containsKey(name)){
                    System.out.println("boyle bir musteri zaten yok. Lütfen gecerli bir musteri yazin");
                    name=scanner.next();
                }
                liste.remove(name);
                personelIslemleri();
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
