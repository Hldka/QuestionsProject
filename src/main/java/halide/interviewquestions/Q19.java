package halide.interviewquestions;

import java.util.Scanner;

public class Q19 {
    /*
Kullanıcıdan ters çevrilmiş bir piramidin satır sayısını girmesini isteyin.
Ters piramit oluşturmak için bir program yazın.
   Örneğin; satır sayısı 5 ise piramit şöyle olacaktır;
    * */

    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("satir sayisini giriniz...");
        int str=scan.nextInt();


        for (int i=str;i>0;i--){
            for (int bslk=0;bslk<=str;bslk++){
                System.out.print(" ");
            }for (int j=0;j<2*i-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
