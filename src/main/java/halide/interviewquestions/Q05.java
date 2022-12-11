package halide.interviewquestions;

import java.util.Arrays;
import java.util.Scanner;

public class Q05 {/*
Bir Array oluşturun ve
en büyük ve en küçük sayılar arasındaki farkı veririn.
Kullanıcıdan Array  öğelerini girmesini isteyin.*/

    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("Array'in eleman sayisini giriniz...");
        int say=scan.nextInt();
        int [] arr=new int[say];
        System.out.println(" array'e girmek istediginiz elemanlari giriniz...");
       for (int i=0;i<say;i++){
           arr[i]=scan.nextInt();
       }
        System.out.println(Arrays.toString(arr));
       Arrays.sort(arr);
       int fark= arr[arr.length-1]-arr[0];
        System.out.println(fark);
    }


}
