package halide.interviewquestions;

import java.util.Scanner;

public class Q04 {//Asal olup olmadığını kontrol eden method yaziniz


    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen bir sayi giriniz...");
        int say= scan.nextInt();
        Asalsay(say);
    }public static void Asalsay(int say){
        int count=0;
if (say>0){
    if (say==1){
        System.out.println("sayi asal sayidir");

    } else { for (int i=2;i<say;i++){if (say%i==0){count++;}}if (count==0){
        System.out.println(say+" A45sal sayidr");
    }else {
        System.out.println(say+"Asal sayi degildir...");
    }}
        

    }else {
    System.out.println(" pozitif bir sayi giriniz...");
}}}
