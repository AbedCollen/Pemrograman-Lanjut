/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas.pkg1;

import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class Setor implements Atm{
    
    float jumlah;
    
    @Override
    public void fungsi() {
        
        Akun akun = new Akun();
        
        Scanner input = new Scanner (System.in);
        
        System.out.println("----- Setor -----");
        System.out.print("Masukkan jumlah uang yang ingin di setor : ");

        jumlah = input.nextFloat();

        if (jumlah % 50000 == 0) {
            Tambah object = Tambah.getInstance();
            object.Hasil(jumlah);
        } else {
            System.out.println("Jumlah harus kelipatan 50.000");
        }       
    }
}