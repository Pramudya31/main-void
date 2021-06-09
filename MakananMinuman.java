/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author YOGA
 */
public class MakananMinuman {
  String macam;
      String nama;
  
      
     public static void main(String[] args){ 
   
        
        MakananMinuman jenis = new MakananMinuman();
        System.out.println("Makanan");
        jenis.Makanan();
        System.out.println("Minuman");
        jenis.Minuman();
    }
    
    void Makanan(){
        nama = "Makanan";
        macam= "Nasi goreng, mie goreng, mie rebus";
        System.out.println("Disini kami menjual berbagai "+nama);
        System.out.println(nama+" yang kami jual antara lain adalah = "+macam);
    }
    
    void Minuman(){
        nama = "Minuman";
        macam = "Es teh, Es jeruk, Kopi susu";
        System.out.println("Disini kami menjual berbagai "+nama);
        System.out.println(nama+" yang kami jual antara lain adalah = "+macam);
    }
}
    
