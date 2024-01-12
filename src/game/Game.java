/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package game;

/**
 *
 * @author SMK TELKOM 13
 */
public class Game {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // buat objek
        Player Hero = new Player();
        Player Enemy = new Player();
        
        //memberi nilai atribut 
        Hero.name = "Atha ";
        Hero.speed = 20;
        Hero.healthPoin = 100;
        Hero.damage = 30;
        Hero.armor = 40;
        
        Enemy.name = "Kiran ";
        Enemy.speed = 20;
        Enemy.healthPoin = 100;
        Enemy.damage = 35;
        Enemy.armor = 45;
        
        Hero.run();
        Enemy.run();
        Hero.attack();
        Enemy.attack();
        Enemy.win();
        
        if(Hero.isdead()){
            System.out.println(Enemy.name+"is attacking "+Hero.name);
            System.out.println(Hero.name+"Damage : "+Hero.damage);
            System.out.println(Enemy.name+"Damage : "+Enemy.damage);
            System.out.println("");
            System.out.println(Hero.name + " is Game Over !!");
        }
        
//        Drone yeonjun = new Drone();
//        yeonjun.energi = 20;
//        yeonjun.kecepatan = 66;
//        yeonjun.ketinggian = 0;
//        yeonjun.merek = "samsung";
//        
//        yeonjun.terbang();
//        yeonjun.maju();
//        yeonjun.belok();
//        yeonjun.mundur();
//        yeonjun.turun();
//        yeonjun.matikanMesin();
//        
//        Paus rawr = new Paus();
//        rawr.energi = 90;
//        rawr.kecepatan = 100;
//        rawr.kenyang = 9;
//        rawr.NmPaus = "Paus orca";
//        
//        rawr.berenang();
//        rawr.belok();
//        rawr.majubg();
//        rawr.mundur();
//        rawr.defeat();
    }
}
