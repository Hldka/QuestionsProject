package halide.interviewquestions;

import java.util.Scanner;

public class Q03 {
    // fibonacci sayi : kullanicadan alinan sayi kadar fibonacci sayisi görebilecegimiz method’u yaziniz …

    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println(" istediginiz sayi girin ....fibonnacci'yi  görünüz ...");
        int sy= scan.nextInt();
        int fib = 0;
        int fib1=1;
        int fib2=1;
        System.out.print(fib1+" ");
        System.out.print(fib2+" ");
        for (int i=2;i<=sy-1;i++){
            fib=fib1+fib2;
             fib1=fib2;
            fib2=fib;
            System.out.print(fib +" ");
           
        }



    }

}
