package halide.MaceraOyun;

import java.util.Scanner;

public class Game {
    public Player player;
    public Location location;

    Scanner scan =new Scanner(System.in);
     public  void start(){


         System.out.println(" Oyunumuza Hosgeldiniz....");
         System.out.println(" Nickname'nizi giriniz...");
         String nick=scan.nextLine();
Player player=new Player(nick);
         System.out.println("Sevgili"+player.getName()+"oyuna hosgeldiniz...");

     }
}
