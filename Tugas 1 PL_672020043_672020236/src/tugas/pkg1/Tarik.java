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
public class Tarik implements Atm {

    float jumlah;

    @Override
    public void fungsi() {
        Akun akun = new Akun();
        Tugas1 tugas1 = new Tugas1();
        
        if (tugas1.saldo > 100000) {
            Scanner input = new Scanner (System.in);
        
            System.out.println("----- Tarik -----");
            System.out.print("Masukkan jumlah uang yang ingin di tarik : ");

            jumlah = input.nextFloat();

            if (jumlah % 50000 == 0) {
                Kurang object = Kurang.getInstance();
                object.Sisa(jumlah);
            } else {
                System.out.println("Jumlah harus kelipatan 50.000");
            }
        } else {
            System.out.println("Gagal karena saldo kurang dari 100.000");
        }
    }  
}