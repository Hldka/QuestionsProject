package halide;

import java.time.LocalTime;
import java.util.Scanner;

public class QNov4 {/*
    1). soru
İlk on doğal sayının karelerinin toplamı,
  1² +2 ²+…..+10 ² = 385
İlk on doğal sayının toplamının karesi,
(1+2+...+10) ²  =55 ² = 3025
Dolayısıyla ilk on doğal sayının kareleri toplamı ile toplamın
karesi arasındaki fark,
3025-385=2640.
İlk yüz doğal sayının kareleri toplamı ile toplamın karesi
arasındaki farkı bulun.

2). Soru
İlk altı asal sayıyı listeleyerek: 2, 3, 5, 7, 11 ve 13, 6. asal
sayının 13 olduğunu görebiliriz.
10001. asal sayı kaçtır?

2) Set ve Liste arasındaki ortak öğeleri yazdırmak için kod yazınız.
3) Bir tamsayı listesinde 13 öğesinden önceki tüm liste öğelerinin toplamını bulunuz.
4)String' lerden oluşan bir arrayde uzunluğu en küçük olan elemanları bulunuz.
 Örnek: ( Kemal, Jonathan, Mark, Angie, Veli ) ==> Output is Mark, Veli
5)Bir String' de tekrarlanan karakterleri yazdırmak için kod yazınız. Örneğin; accessories  ́ ces
6)Ayın numarasını girdiğinizde ayın adını yazdırmak için bir switch ifadesi kullanınız. Örneğin;
kullanıcı 1 girerse kodunuz "Ocak" yazmalıdır,
kullanıcı 2 girerse kodunuz "Şubat" yazmalıdır vb.
Kullanıcı geçersiz ay numarası girerse kodunuz "Geçersiz numara" yazmalıdır.
7)Ternary kullanarak, aşağıdaki kodları konsolda yazdırınız.
a) Bir üçgenin iki kenarının uzunluğu eşitse "İkizkenar Üçgen".
b) Bir üçgenin tüm kenarlarının uzunluğu eşitse "Eşkenar Üçgen".
c) a ve b koşulları sağlanmıyorsa "Çeşit Kenar Üçgen "
8)Aşağıdaki seçenekler doğrultusunda gereken kodu yazınız.
a) Şifre boşluk karakterinden farklı en az 8 karakter içeriyorsa "Geçerli Şifre"
b) Herhangi bir pozisyonda şifrede boşluk karakteri varsa "Şifrede boşluk karakteri kullan- mayınız"
c) a ve b koşullarının sağlanmaması durumunda "Geçersiz Şifre"
Not: Çözümdeki koşulların sıralarına dikkat ediniz.*/

    public static void main(String[] args) {
       // 5)1) Eğer saat
//        i) 24:00 ile 05:00 arasında ise konsola 'Uyku zamanı' yazdırınız.
//                ii) 08:00 ile 16:00 arasında ise konsola 'Çalışma zamanı' yazdırınız.
//                iii) 19:00 ile 22:00 arasında ise konsola 'Aile zamanı' yazdırınız.
//                iv) Diğerleri için konsolda 'Kişisel zaman' yazdırınız.
        LocalTime saat= LocalTime.now();
        System.out.println(saat);

        LocalTime sabah=LocalTime.of(5,0);
        LocalTime saatOn=LocalTime.of(22,0);
        LocalTime saatOndokuz=LocalTime.of(19,0);
        LocalTime saatSekiz=LocalTime.of(8,0);
        LocalTime onAlti=LocalTime.of(16,0);
        LocalTime geceYarisi=LocalTime.of(0,0);
        if (saat.isAfter(geceYarisi) && saat.isBefore(saat)){
            System.out.println("uyku zamani!!!");
        } else if (saat.isAfter(saatSekiz) && saat.isBefore(onAlti)) {
            System.out.println("calisma zamani");
        } else if (saat.isAfter(saatOndokuz) && saat.isBefore(saatOn)) {
            System.out.println("Aile zamani");
        }else {
            System.out.println("kisile zaman");
        }
        Scanner sc = new Scanner(System.in);
        System.out.print("Kacinci asal sayiyi ögrenmek istiyorsunuz ? : ");
        int n = sc.nextInt();
        int num=1, count=0, i;
        //n'inci sayiya varana kadar döngü devam etsin
        while (count < n) {
            //2'den, yani ilk asal sayidan basliyoruz.
            num=num+1;
            for (i = 2; i <= num; i++) {
                //bolunen bir sayi varsa dongüden cik. Sayiyi bir artirip devam et
                if (num % i == 0) {
                    break;
                }
            }
            //döngüden hicbir sayiya bölünmeden döngüden cikan sayi asaldir. Bunu da i'nin sayiya kadar gelmesinden anlariz.
            // Bu nedenle sayaci bir atiririz.
            if (i == num) {
                count = count+1;
            }
        }
        System.out.println(n +". asal sayi: " + num);
    }

}
