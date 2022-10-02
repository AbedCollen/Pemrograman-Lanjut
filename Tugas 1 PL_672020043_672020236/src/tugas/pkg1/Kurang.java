/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas.pkg1;

/**
 *
 * @author LENOVO
 */
public class Kurang {
    private static Kurang instance = new Kurang();
    float sisa;
    
    private Kurang(){}
    
    public static Kurang getInstance(){        
        return instance;
    }
    
    public void Sisa(float jumlah){
        Akun akun = new Akun();
        Tugas1 tugas1 = new Tugas1();
        sisa = tugas1.saldo - jumlah;
        akun.setSaldo(sisa);
    }
}