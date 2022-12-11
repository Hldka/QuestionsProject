package halide.interviewquestions;

import java.util.Scanner;

public class Q06 {// Q06 INTERVIEW
    // Kullanicidan bir String aliniz ve onun palindrom olup olmadigini kontrol eden method'u olusturunuz
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen bir string giriniz...");
        String str=scan.nextLine().toLowerCase();
        palindrommu(str);

       // palindrommu1(str);
    }
    public static void palindrommu(String str){
        StringBuilder str1=new StringBuilder(str);
       StringBuilder str2=str1.reverse();
        System.out.println(str2);
        if (str1==str2){
            System.out.println(str+"  : palindrom dur");
        }else if (str1!=str1){
            System.out.println("palindrom degildir");
        }else System.out.println("lütfen gecerli bir string giriniz");

    }/*public static void palindrommu1(String str){

        String rvrse="";
        for (int i=str.length()-1;i<=0;i--){
            rvrse=rvrse+str.charAt(i);

        }if (str.equals(rvrse)){} else if (!str.equals(rvrse)) { System.out.println("palindrom degildir");

        }else System.out.println("lütfen gecerli bir string giriniz");


    }*/


}
