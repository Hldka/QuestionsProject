package halide;

public class QNov3 {/*
1) Palindromik bir sayı her iki şekilde de aynı şekilde
    okunur. 2 basamaklı iki sayının çarpımından elde edilen en büyük palindrom
9009 = 91 × 99'dur.
        3 basamaklı iki sayının çarpımından oluşan en büyük palindromu
    bulun.

 2) 2520, 1'den 10'a kadar olan sayıların her birine kalansız
    bölünebilen en küçük sayıdır.
            1'den 20'ye kadar olan sayıların tamamına tam bölünebilen en küçük pozitif sayı
    kaçtır ?
    3) Ternary kullanarak, aşağıdaki kodları konsolda yazdırınız.
Parola boşluk karakterinden farklı olarak en az 8 karakter içeriyorsa, "Geçerli Parola",
Parola boşluk karakterinden farklı olarak 8 karakterden daha az ise, "Geçersiz Parola"
4)1) Aşağıdaki seçenekler doğrultusunda gereken kodu yazınız.
a) Aralık, Ocak, Şubat için "Kış"
b) Mart, Nisan, Mayıs için "İlkbahar"
c) Haziran, Temmuz, Ağustos için "Yaz"
d) Eylül, Ekim, Kasım için "Sonbahar"
e) Diğerleri için "Geçersiz ay adı"
5)1) Eğer saat
i) 24:00 ile 05:00 arasında ise konsola 'Uyku zamanı' yazdırınız.
ii) 08:00 ile 16:00 arasında ise konsola 'Çalışma zamanı' yazdırınız.
iii) 19:00 ile 22:00 arasında ise konsola 'Aile zamanı' yazdırınız.
iv) Diğerleri için konsolda 'Kişisel zaman' yazdırınız.
6) Ali'nin kaç gün yaşadığını bulan kodu yazınız. Ali'nin doğum tarihi 12 Mayıs 2002'dir.
7)Sadece tek bir kelimeden oluşan şehir isimleri için bir String değişkeni oluşturun. Şehir ismini, baş harfi büyük ve diğer tüm karakterleri küçük harfler olacak şekilde konsolda yazdırınız.
Örnek: mIAMI - Miami miami - Miami MIAMI - Miami
mIaMi - Miami vb.
8)Byte data tipinin minimum değeri ile short data tipinin maksimum değerinin toplamını bulmak için bir kod yazınız.
9) Short data tipinde bir değişken oluşturunuz ve onu bir int değişkenine dönüştürünüz.
    */
    public static void main(String[] args) {
//        1) Palindromik bir sayı her iki şekilde de aynı şekilde
//        okunur. 2 basamaklı iki sayının çarpımından elde edilen en büyük palindrom
//        9009 = 91 × 99'dur.
//        3 basamaklı iki sayının çarpımından oluşan en büyük palindromu
//        bulun.

        int c;
        int ikincisayi=0;
        int ilksayi=0;
        int max = 100;
        for (int i = 100; i <1000; i++) {
            for (int j =100; j <1000; j++) {
                c=i*j;
                if (c==terscevir(c)&&c>max){
                    max = c;
                    ilksayi=i;
                    ikincisayi=j;
                }

            }
        }
        System.out.println(ilksayi+"*"+ikincisayi+"="+max);

    }
    public static int terscevir(int a){
        String kutu="";
        int ters = 0;
        String terssayi=String.valueOf(a);
        for (int i =terssayi.length()-1; i>-1; i--) {
            kutu+=terssayi.charAt(i);
            ters=Integer.valueOf(kutu);
        }
        return ters;


        //2) 2520, 1'den 10'a kadar olan sayıların her birine kalansız
//        bölünebilen en küçük sayıdır.
//        1'den 20'ye kadar olan sayıların tamamına tam bölünebilen en küçük pozitif sayı
//        kaçtır ?
/*
int top = 0;
        int j=21;

        while (true) {
            top=0;
            j++;
            for (int i = 2; i <12; i++) {
                top += j % i;
            }
            if (top==0){
                System.out.println(j);
                break;
            }
 */


    } }

