/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package game;

/**
 *
 * @author SMK TELKOM 13
 */
class Drone {
   //atribut 
   int energi;
   int ketinggian;
   int kecepatan; 
   String merek; 
   
   //method
   void terbang(){
       energi--;
       if(energi > 10){
           // terbang berarti nilai ketinggian bertambah 
           ketinggian++;
           System.out.println("Drone terbang...");
       } else {
           System.out.println("Energi lemah: drone tidak bisa terbang");
       }
   }
   
   void matikanMesin(){
       if(ketinggian > 0){
           System.out.println("Mesin tidak bisa dimatikan karena sedang terbang");
       }else {
           System.out.println("Mesin dimatikan...");
       }
   }
   
   void turun(){
       //ketinggian berkurang karena turun 
       ketinggian --;
       energi--;
       System.out.println("Drone turun");
   }
   
   void belok(){
       energi--;
       System.out.println("Drone belok");
       //belok kemana ?? berlu dicek
   }
   
   void maju(){
       energi--;
       System.out.println("Drone maju kedepan");
       kecepatan++;
   }
    
   void mundur(){
       energi--;
       System.out.println("Drone mundur");
       kecepatan++;
   }
}
