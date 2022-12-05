package halide.MaceraOyun;

import java.util.Scanner;

public class Game {
     public static void start(){
         System.out.println(" Oyunumuza Hosgeldiniz....");
         System.out.println(" Nickname'nizi giriniz...");
         Scanner scan =new Scanner(System.in);
         String nick=scan.nextLine();
Player player=new Player(nick);
         System.out.println("Sevgili"+player.getName()+"oyuna hosgeldiniz...");

     }
}
