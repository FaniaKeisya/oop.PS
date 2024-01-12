/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package game;

/**
 *
 * @author SMK TELKOM 13
 */
public class Paus {
    // atribut 
    int energi;
    int kecepatan;
    int kenyang;
    String NmPaus;
    
    //method
    void berenang(){
        energi--;
        if(energi > 20){
            System.out.println("Paus berenang ...");
        }else{
            System.out.println("Lapar bang, gabisa renang");
        }
    }
    
    void belok(){
        energi--;
        System.out.println("Paus belok untuk mencari jalan");
    }
    
    void majubg(){
        energi--;
        System.out.println("Paus maju mengejar mangsa RAWRRR");
        kecepatan++;
    }
    
    void mundur(){
        energi--;
        System.out.println("Paus mundur, ada perampok");
        kecepatan++;
    }
    
    void defeat(){
        if(kenyang > 10){
            System.out.println("Paus masih ingin hidup");
        }else{
            System.out.println("!paus left the group!");
        }
    }
}
