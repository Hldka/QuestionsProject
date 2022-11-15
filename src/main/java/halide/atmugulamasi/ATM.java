package halide.atmugulamasi;

import java.util.HashMap;
import java.util.Scanner;



public class ATM {
    public static HashMap<Integer,Integer> müsteriNoSifre=new HashMap<>();
    Scanner scan=new Scanner(System.in);
    int musteriNo= scan.nextInt();
    int sifre= scan.nextInt();
    public static void main(String[] args) {

       müsteriNoSifre.put(12345678	 ,  1876);
       müsteriNoSifre.put(22222222	   ,1234);
       müsteriNoSifre.put(98765432	 ,  1453);
       müsteriNoSifre.put(55554444	  , 2020);

       HashMap<Integer,Float> müsterinoPara=new HashMap<>();
       müsterinoPara.put(12345678	  , 120.0F);
       müsterinoPara.put(22222222	 ,  3000.0F);
       müsterinoPara.put(98765432	 , 7000.0F);
       müsterinoPara.put(55554444	  , 50.0F);


        System.out.println("Müsteri numarasini giriniz... ");

        System.out.println("Sifrenizi giriniz...");




    }
        public void musteriNumarasiDogruMu(int no){
            for (Integer w:müsteriNoSifre.keySet()  ) { if (w==no){
                System.out.println("Müsteri No dogru...lütfen sifreyi giriniz...");
                System.out.println(no);

            }this.musteriNo=no;

            }


        }public  void sifredogrumu(int no,int sifre){
       Integer sifre1 =müsteriNoSifre.get(musteriNo);
       if (sifre1==sifre){
           System.out.println("giris yapildi");
       }
    }
}
