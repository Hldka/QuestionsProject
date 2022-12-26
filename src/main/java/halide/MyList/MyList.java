package halide.MyList;

import java.util.ArrayList;
import java.util.List;

public class MyList<T> {
   public int capacity;
   public T[] array;

   public MyList() {
   }
/**
     * Sınıf özellikleri :

     *1) Sınıf içerisindeki dizinin varsayılan boyutu 10 ve dizinin eleman sayısı ihtiyaç duydukça 2 katı şeklinde artmalı.   OK

     * 2)Sınıfa ait iki tür constructor metot bulunmalı

     * 3)MyList() : Boş contructor kullanılırsa dizinin başlangıç boyutu 10 olmalıdır.ok

     *4) MyList(int capacity) : Dizinin başlangıç değeri capacity parametresinden alınmalıdır.ok

     * 5)size() : dizideki eleman sayısını verir.

     * 6)getCapacity() : dizinin kapasite değerini verir.

     * 7)add(T data) : sınıfa ait diziye eleman eklemek için kullanılmalıdır. Eğer dizide yeteri kadar yer yok ise,
     * dizi boyutu 2 katına çıkartılmalıdır.

     * 8)get(int index): verilen indisteki değeri döndürür. Geçersiz indis girilerse null döndürür.

     * 9)remove(int index): verilen indisteki veriyi silmeli ve silinen indis sonrasında ki verileri sol doğru kaydırmalı. Geçersiz indis girilerse null döndürür.

     * 10)set(int index, T data) : verilen indisteki veriyi yenisi ile değiştirme işlemini yapmalıdır. Geçersiz indis girilerse null döndürür.

     * 11)String toString() : Sınıfa ait dizideki elemanları listeleyen bir metot.
     * 12)int indexOf(T data) : Parametrede verilen nesnenin listedeki indeksini verir. Nesne listede yoksa -1 değerini verir.

     * 13)int lastIndexOf(T data) : Belirtilen öğenin listedeki son indeksini söyler. Nesne listede yoksa -1 değerini verir.

     * 14)boolean isEmpty() : Listenin boş olup olmadığını söyler.

     * 15)T[] toArray() : Listedeki öğeleri, aynı sırayla bir array haline getirir.

     *16) clear() : Listedeki bütün öğeleri siler, boş liste haline getirir.

     *17) MyList<T> sublist(int start,int finish) : Parametrede verilen indeks aralığına ait bir liste döner.

     * 18)boolean contains(T data) : Parametrede verilen değerin dizide olup olmadığını söyler.
     */

}
