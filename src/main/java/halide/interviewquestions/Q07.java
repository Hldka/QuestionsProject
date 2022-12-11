package halide.interviewquestions;

import java.util.Scanner;

public class Q07 {/*
Her basamağının küpünün toplamına eşit olan bir sayıya Armstrong sayısı denir.
Örneğin, 153= 1 + 125 + 27, 1^3+5^3+3^3'e eşit olduğu için 153 bir Armstrong sayısıdır.
Verilen sayının Armstrong sayısı olup olmadığını kontrol etmek için bir program yaziniz.
*/

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.println("BIR numara giriniz bunun Armstrong olup olmadigini check ediniz...");
        int n = scan.nextInt();

        int kuport = 0;
        int say = n;
        int deger = 0;

        while(n>0) {
            deger = n%10;
            kuport = kuport + deger*deger*deger;
            n = n/10;
        }

        if(deger==kuport) {
            System.out.println(say + " is Armstrong number");
        }else {
            System.out.println(say + " is not Armstrong number");
        }

        scan.close();



    }



}
