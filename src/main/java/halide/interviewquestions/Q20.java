package halide.interviewquestions;

import java.util.Scanner;

public class Q20 {
    /*


Kenar uzunluğu kullanıcı tarafından verilecek ikizkenar dik üçgen çizmek için kodu yazın.
     */

    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println(" lütfen kenar uzunlugu giriniz");
        int knr= scan.nextInt();
       ikizkenarUcgen(knr);


    }public  static void ikizkenarUcgen(int kenar){
       int uznlk=1;
        System.out.println("*");
        for (int i=1;i<kenar;i++){
            uznlk=2*i-1;
            int count =0;
            if(i<=uznlk){
                System.out.print("*");
                for (int k=0;k<uznlk;k++){
                    if (i<kenar-1){
                        System.out.print(" ");
                    }else if (i==kenar-1){
                        System.out.print(" *");
                        count++;
                        if (count==kenar-1){break;}
                    }
                }if (count<kenar-1){
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
