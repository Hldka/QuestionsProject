package halide;

public class QNov5 {/*
    1)Double data tipinde bir değişken oluşturunuz ve onu bir float değişkenine dönüştürünüz.
    2)İki tamsayıyı değiştirmek için bir kod yazınız.

    3) Long data tipinde bir değişken oluşturunuz ve onu bir int değişkenine dönüştürünüz.
    4) Data tipi String olan "103" değerini byte data tipine dönüştürmek için bir kod yazınız ve yine data
     tipi String olan "2351" değerini short data tipine dönüştürüp konsolda iki değişken arasındaki farkı yazdırınız.
    5) Kişi isimleri için 3 String değişken oluşturunuz. Boşluk karakterleri hariç 3 isimdeki karakter sayısının toplamını yazdırınız.
Örnek: İsimler Ali Can, Merve Star, Mark Tom ise konsolda 22 görmelisiniz.
6) Ali'nin kaç ay yaşadığını bulan kodu yazınız. Ali'nin doğum tarihi 4 Haziran 1997'dir.
7) Japonya saat dilimi ile Almanya saat dilimi arasındaki saat farkını bulmak için kodu yazınız.
8)
1000 basamaklı sayının en büyük çarpımı olan bitişik dört basamağı 9 × 9 × 8 ×
9 = 5832'dir.

73167176531330624919225119674426574742355349194934

96983520312774506326239578318016984801869478851843

85861560789112949495459501737958331952853208805511

12540698747158523863050715693290963295227443043557

66896648950445244523161731856403098711121722383113

62229893423380308135336276614282806444486645238749

30358907296290491560440772390713810515859307960866

70172427121883998797908792274921901699720888093776

65727333001053367881220235421809751254540594752243

52584907711670556013604839586446706324415722155397

53697817977846174064955149290862569321978468622482

83972241375657056057490261407972968652414535100474

82166370484403199890008895243450658541227588666881

16427171479924442928230863465674813919123162824586

17866458359124566529476545682848912883142607690042

24219022671055626321111109370544217506941658960408

07198403850962455444362981230987879927244284909188

84580156166097919133875499200524063689912560717606

05886116467109405077541002256983155200055935729725

71636269561882670428252483600823257530420752963450


1000
basamaklı sayının en büyük çarpımı olan on üç basamağı bulun. Bu sayının değeri nedir?


9. soru
Bir
Pisagor üçlüsü, a < b < c olmak
üzere üç doğal sayı kümesidir, bunun için,
a 2 + b 2 = c 2
Örneğin,
3 2 + 4 2 = 9 + 16 = 25 = 5 2 .
a + b + c =
1000 olan tam olarak bir Pisagor üçlüsü vardır . abc
çarpımını bulun .
     */

    public static void main(String[] args) {
        int count=0;
        for (int i=0;i<1000;i++){
            for (int j=0;j<1000;j++){
                for (int k=0;k<1000;k++){

                    if (i>j&&j>k){
                        int crpm=(k*k)+(j*j);
                        if (i*i==crpm){if (i+k+j==1000){
                            System.out.println(i);
                            System.out.println(j);
                            System.out.println(k);
                            System.out.println(i*j*k);

                        }


                        }
                    }
                }


            }
        }

    }
    }

