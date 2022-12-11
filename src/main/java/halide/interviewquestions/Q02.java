package halide.interviewquestions;

import java.util.Scanner;

public class Q02 {
    //Write a Java Program to swap two number
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println(" Bir tane deger giriniz ...");
        int a= scan.nextInt();
        System.out.println("Ikinci degeri giriniz ...");
        int b= scan.nextInt();
        // ilk yol
        System.out.println("a = "+a);
        System.out.println("b = "+b);
        int c=0;
         c=a;
         a=b;
         b=c;
        System.out.println("a = "+a);
        System.out.println("b = "+b);

// ikinci yol
        a = a + b;
        b= a - b;
        a = a - b;
        System.out.println("a = "+a);
        System.out.println("b = "+b);
    }

}
