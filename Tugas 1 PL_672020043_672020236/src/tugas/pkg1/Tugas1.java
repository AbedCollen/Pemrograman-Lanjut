/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugas.pkg1;

import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class Tugas1 {

    /**
     * @param args the command line arguments
     */
    
    public static float saldo = 500000;
    
    public static void main(String[] args) {
        
        AtmFactory atmFactory = new AtmFactory();
        Tarik tarik = new Tarik();

        String pilih;
        
        Scanner input = new Scanner (System.in);
        
        while ( true ) {
            System.out.println("----- ATM -----");
            System.out.println("1. Cek Saldo");
            System.out.println("2. Tarik Tunai");
            System.out.println("3. Setor Tunai");
            System.out.println("4. Keluar");
            System.out.print("Masukkan pilihan : ");
            pilih = input.nextLine();
   
            Atm atm = atmFactory.getAtm(pilih);
            atm.fungsi();
            
            switch(pilih) {
                case "1": 
                    System.out.println("");
                    break;
                case "2": 
                    Kurang object_1 = Kurang.getInstance();                  
                    if (saldo != object_1.sisa && object_1.sisa != 0) {
                        saldo = object_1.sisa;
                    }
                    System.out.println("Saldo sekarang : "+saldo);
                    System.out.println("");
                    break;
                case "3": 
                    Tambah object_2 = Tambah.getInstance();
                    if (saldo != object_2.hasil && object_2.hasil != 0) {
                        saldo = object_2.hasil;
                    }
                    System.out.println("Saldo sekarang : "+saldo);
                    System.out.println("");
                    break;
                case "4": 
                    System.out.println("Berhasil keluar");
                    break;
                default:
                    System.out.println("Pilihan salah");
                
            }
        }
    }
}
