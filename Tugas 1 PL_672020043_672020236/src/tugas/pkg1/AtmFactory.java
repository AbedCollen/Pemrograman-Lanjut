/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas.pkg1;

/**
 *
 * @author LENOVO
 */
public class AtmFactory {
    public Atm getAtm(String atmType) {
        if(atmType == null) {
            return null;
        }
        if(atmType.equalsIgnoreCase("1")) {
            return new Saldo();
        } else if(atmType.equalsIgnoreCase("2")) {
            return new Tarik();
        } else if(atmType.equalsIgnoreCase("3")) {
            return new Setor();
        } else if(atmType.equalsIgnoreCase("4")) {
            return new Keluar();
        }
        System.out.println("Pilihan salah");
        return null;
    }                
}
