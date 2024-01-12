/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package game;

/**
 *
 * @author SMK TELKOM 13
 */
public class Player {
    //atribut
    String name;
    int speed, healthPoin, damage, armor;
    
    //method
    void run(){
        System.out.println(name + "is running ...");
        System.out.println("Speed "+speed);
    }
    
    boolean isdead(){
        if(healthPoin<=20) return true;
        return false;
    }
    
    void attack(){
        System.out.println(name+" is attacking...");
        System.out.println("attack = "+damage);
    }
    
    void defense(){
        System.out.println(name +"is defend...");
        System.out.println("Defense = "+armor);
    }
    
    void win(){
        if(healthPoin >=60){
            System.out.println("WINNER!!");
        }else{
            System.out.println(isdead());
        }
    }
}
