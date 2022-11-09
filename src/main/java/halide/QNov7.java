package halide;

import java.util.Scanner;

public class QNov7 {/*
    1)Bir tamsayı listesindeki tüm çift sayıların çarpımını bulunuz.
    2)Bir listedeki öğelerin azalan sırada olup olmadığını kontrol ediniz. Örnek: (Sarı, Mavi, Kırmızı, Yeşil) ==> Çıktı: Azalan sırada değil
(Sarı, Kırmızı, Yeşil, Mavi) ==> Çıktı: Azalan sıradadır
3)Tamsayılardan oluşan bir arrayde en küçük pozitif elemanı ve en büyük negatif elemanı bulunuz.
Örnek:(-12, 18, -5, 23, -2) ==> En küçük pozitif 18, en büyük negatif -2
4) String' lerden oluşan bir arrayde öğeler 'n' veya 'k' ile bitiyorsa, o öğelerin baş harflerini alınız.
Örnek: { "Kemal", "Jonathan", "Mark", "Jackson", "Ali" } ==> Çıktı JJM
5)Benzersiz (Tekrarsız) rakamları bir tamsayı olarak yazdırmak için kod yazınız. Örnek; 223878  ́ 37
4)Cinsiyet "Erkek" ise "Erkek" yazdırınız. Cinsiyet "Kadın" ise "Kız" yazdırınız.
Cinsiyet "Erkek" ve "Kadın"dan farklıysa "Diğerleri" yazdırınız. Not : Bu seçenekler dışındakilerini yoksayınız.
5)Nested Ternary kullanarak Apex kodunu yazınız.
Bir yılın artık yıl olup olmadığını kontrol eden bir program yazınız.
Yıl 100'e tam bölünüyorsa 400'e tam bölünmelidir. Bir yıl 100'e tam bölünemiyorsa 4'e tam bölünmelidir.
6)Aşağıdaki seçenekler doğrultusunda gereken kodu yazınız.
a) Son basamak 5 'e eşit ve 5 den büyükse, yuvarlama işlemi: "Son basamağı bir üst ondalı-
ğa yuvarla"
b) Son basamak 5 den küçükse, yuvarlama işlemi: "Son basamağı bir alt ondalığa yuvarla"
7)Ali 5 Şubat 2015 saat 10:15 EST'de doğmuştur, Veli 6 Mart 2015 saat 12:25 EST'de doğmuştur.
 Ali ve Veli'nin doğum süreleri arasındaki fark nedir?
 8)Ali, 29 Ekim 1923'ten 45 yıl 8 ay 5 gün sonra doğmuştur.
Veli, 15 Eylül 1993'ten 24 yıl 2 ay 11 gün önce doğmuştur.
Ali ve Veli'nin kesin doğum tarihini hesaplamak için kodu yazınız.
Ali ve Veli'nin doğum tarihinin aynı olup olmadığını kontrol etmek için kodu yazınız.
9)Bir String değişkeni oluşturunuz, String'deki rakam olmayan karakterlerin sayısını konsolda yazdırınız.
Örnek: String: '1a3Bcf4!...' ise konsolda 8 yazdırmanız gerekir.
10)Üçgen sayıları dizisi, doğal sayıların eklenmesiyle oluşturulur.

Yani 7. üçgen sayısı 1 + 2 + 3 + 4 + 5 + 6 + 7 = 28 olur. İlk on terim şöyle olur:

                                                      1, 3, 6, 10, 15, 21, 28, 36, 45, 55, …

İlk yedi üçgen sayısının çarpanlarını sıralayalım:

1: 1
 3: 1,3
 6: 1,2,3,6
10: 1,2,5,10
15: 1,3,5,15
21: 1,3,7,21
28: 1,2,4,7,14,28
28'in beşten fazla böleni olan ilk üçgen sayı olduğunu görebiliriz.

Beş yüzün üzerinde böleni olan ilk üçgen sayısının değeri kaçtır?
11)Pozitif tamsayılar kümesi için aşağıdaki yinelemeli dizi tanımlanır:

                     n → n/2 (n çifttir)

                     n → 3n + 1 (n tektir)


Yukarıdaki kuralı kullanarak ve 13’den başlayarak aşağıdaki diziyi oluşturuyoruz:

                   13 → 40 → 20 → 10 → 5 → 16 → 8 → 4 → 2 → 1


""Bu dizinin (13'ten başlayıp 1'de biten) 10 terim içerdiği görülebilir.

Henüz kanıtlanmamış olmasına rağmen (Collatz Problemi), tüm başlangıç sayılarının

 1'de bittiği düşünülmektedir.""


Bir milyonun altındaki hangi başlangıç sayısı en uzun zinciri oluşturur?

NOT: Zincir başladıktan sonra terimler bir milyonun üzerine çıkabilir.*/
    /*
    Pozitif tamsayılar kümesi için aşağıdaki yinelemeli dizi tanımlanır:

                     n → n/2 (n çifttir)

                     n → 3n + 1 (n tektir)


Yukarıdaki kuralı kullanarak ve 13’den başlayarak aşağıdaki diziyi oluşturuyoruz:

                   13 → 40 → 20 → 10 → 5 → 16 → 8 → 4 → 2 → 1


""Bu dizinin (13'ten başlayıp 1'de biten) 10 terim içerdiği görülebilir.

Henüz kanıtlanmamış olmasına rağmen (Collatz Problemi), tüm başlangıç sayılarının

 1'de bittiği düşünülmektedir.""


Bir milyonun altındaki hangi başlangıç sayısı en uzun zinciri oluşturur?

NOT: Zincir başladıktan sonra terimler bir milyonun üzerine çıkabilir.
     */
    public static int cift(int a){
        if (a%2==0){
            return a/2;}else return a*3+1;

    } public static void main(String[] args) {
        int y=13;
        do {y=cift(y);
            System.out.print(y+" ");

        }while (y!=1);




     Scanner input = new Scanner(System.in);
        System.out.println("Kacıncı ucgen sayisini istersiniz?");
    int kacinci=input.nextInt();
    int sum =0;
        for (int i =1;i<=kacinci;i++){
        sum = sum+i;
        System.out.print(sum+" ");
    }

        System.out.println();

    int b=1;
        while (b<=sum){
        carpan(sum,b);
        b++;
    }}public static void carpan(int a,int b){
            if (a%b==0) {
                System.out.print(a / b +" ");
            }


    }


}


