package halide.interviewquestions;

import java.util.Scanner;

public class Q01 {
    //interview Q1 //Write a Java Program to reverse a string . 3 yoldan cözünüz…
    public static void main(String[] args) {

       reverseStr();


    }public static void reverseStr(){
        Scanner scan =new Scanner(System.in);
        System.out.println("lütfen bir string giriniz ");
        String str=scan.nextLine();
   String rev="";
        for (int i=str.length()-1;i>=0;i--){
            rev=rev+str.charAt(i);

        }
        System.out.println(rev);
//2.yol
    StringBuilder str1=new StringBuilder(str);
        System.out.println(str1.reverse());

        //.yol



    }



}
