/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas.pkg1;

/**
 *
 * @author Abed
 */
public class Tambah {
    private static Tambah instance = new Tambah();
    float hasil;
    
    private Tambah(){}
    
    public static Tambah getInstance(){        
        return instance;
    }
    
    public void Hasil(float jumlah){
        Akun akun = new Akun();
        Tugas1 tugas1 = new Tugas1();
        hasil = tugas1.saldo  + jumlah;
        akun.setSaldo(hasil);
    }
}